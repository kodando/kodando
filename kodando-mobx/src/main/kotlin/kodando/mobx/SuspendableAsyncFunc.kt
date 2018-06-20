package kodando.mobx

typealias SuspendableAsyncFunc<T, R> = suspend (T) -> R
