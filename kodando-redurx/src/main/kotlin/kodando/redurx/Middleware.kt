package kodando.redurx

typealias Middleware<T> = (Store<T>, Reducer<T>) -> Reducer<T>
