@file:JsModule("rxjs/Rx")
@file:JsNonModule

package kodando.rxjs

external open class BehaviorSubject<T>(initialValue: T) : ISubject<T> {
    val value: T
    override fun next(data: T)
    override fun error(error: Error)
    override fun complete()
    override fun subscribe(observer: IObserver<T>): ISubscription
    override fun subscribe(next: NextHandler<T>): ISubscription
    override fun subscribe(next: NextHandler<T>?, error: ErrorHandler?): ISubscription
    override fun subscribe(next: NextHandler<T>?, error: ErrorHandler?, complete: CompleteHandler?): ISubscription
}
