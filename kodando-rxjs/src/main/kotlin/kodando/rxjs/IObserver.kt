package kodando.rxjs

external interface IObserver<in T> {
    fun next(data: T)
    fun error(error: Error)
    fun complete()
}
