package kodando.elmish

import kodando.rxjs.Subject
import kodando.rxjs.operator.scan
import kodando.rxjs.operator.startWith
import kodando.rxjs.subscribeBy
import kotlin.js.Json
import kotlin.js.Promise

fun onError(error: Throwable) {
    console.error(error.message, error)
}

fun <TArg, TModel, TMessage> createProgram(
    init: (TArg) -> Result<TModel, TMessage>,
    update: (TModel, TMessage) -> Result<TModel, TMessage>,
    view: (TModel, Dispatch<TMessage>) -> View): Program<TArg, TModel, TMessage> {

    return Program(
        init = init,
        update = update,
        view = view,
        setState = { state, dispatch -> view(state, dispatch) },
        subscribe = { _ -> noCommand() },
        onError = ::onError
    )
}

fun <TArg, TModel, TMessage> createSimpleProgram(
    init: (TArg) -> TModel,
    update: (TModel, TMessage) -> TModel,
    view: (TModel, Dispatch<TMessage>) -> View): Program<TArg, TModel, TMessage> {

    return Program(
        init = {
            Result(init(it))
        },
        update = { model, message ->
            Result(update(model, message))
        },
        view = view,
        setState = { state, dispatch ->
            view(state, dispatch)
        },
        subscribe = {
            noCommand()
        },
        onError = ::onError
    )
}

fun <TArg, TModel, TMessage> createProgram(component: Component<TArg, TModel, TMessage>): Program<TArg, TModel, TMessage> {
    return createProgram(
        init = component::init,
        update = component::update,
        view = component::render
    )
}

fun <TArg, TModel, TMessage> Program<TArg, TModel, TMessage>.withSubscription(
    subscribe: (TModel) -> Command<TMessage>): Program<TArg, TModel, TMessage> {

    val sub = { model: TModel ->
        batch(
            this.subscribe(model),
            subscribe(model)
        )
    }

    return this.copy(subscribe = sub)
}

fun <TArg, TModel, TMessage> Program<TArg, TModel, TMessage>.withConsoleTrace(): Program<TArg, TModel, TMessage> {
    inline fun toPlain(obj: Any?): Json {
        return JSON.parse(JSON.stringify(obj))
    }

    fun traceInit(arg: TArg): Result<TModel, TMessage> {
        val result = this.init(arg)
        val (model, command) = result
        console.log("Initial state:", toPlain(model))
        return Result(model, command)
    }

    fun traceUpdate(model: TModel, message: TMessage): Result<TModel, TMessage> {
        console.log("New message:", toPlain(model))
        val result = this.update(model, message)
        console.log("Updated state:", toPlain(result.model))
        return result
    }

    return this.copy(
        init = ::traceInit,
        update = ::traceUpdate
    )
}

fun <TArg, TModel, TMessage> Program<TArg, TModel, TMessage>.runWith(arg: TArg) {
    val (model, command) = this.init(arg)

    val messages = Subject<TMessage>()

    val dispatch = { message: TMessage ->
        Promise.resolve<Any?>(null).then {
                messages.next(message)
            }

        Unit
    }

    val update = { state: TModel, message: TMessage ->
        val (newState, command) = this.update(state, message)
        command(dispatch)
        newState
    }

    messages
        .scan(model, update)
        .startWith(model)
        .subscribeBy(
            next = {
                this.setState(model, dispatch)
            }
        )

    command(dispatch)
}
