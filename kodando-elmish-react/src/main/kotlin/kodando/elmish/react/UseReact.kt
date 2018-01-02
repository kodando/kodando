package kodando.elmish.react

import kodando.elmish.Program

fun <TModel, TMessage> Program<TModel, TMessage>.useReact(container: String): Program<TModel, TMessage> {
    val start = { model: TModel ->

    }

    val dispose = {
        this.dispose()
    }

    return copy(
        start = start,
        dispose = dispose
    )
}
