package kodando.elmish

typealias Dispatch<TMessage> = (TMessage) -> Unit

typealias Command<TMessage> = (Dispatch<TMessage>) -> Unit

typealias Subscription<TMessage> = Array<Command<TMessage>>

typealias Updater<TModel, TMessage> = (TModel, TMessage) -> Pair<TModel, Command<TMessage>>

typealias SimpleUpdater<TModel, TMessage> = (TModel, TMessage) -> TModel

typealias Renderer<TModel, TMessage> = (TModel, Dispatch<TMessage>) -> View

