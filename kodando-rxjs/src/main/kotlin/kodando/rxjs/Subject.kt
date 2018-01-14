@file:JsModule("rxjs/Subject")
@file:JsNonModule

package kodando.rxjs

open external class Subject<T> : Observable<T>, Observer<T> {
    override val closed: Boolean?
    override fun next(data: T)
    override fun error(error: Error)
    override fun complete()
    fun asObservable(): Observable<T>

    companion object {
        fun <T> create(destination: Observer<T>, source: Observable<T>): Subject<T>
    }
}
