package kodando.rxjs

external interface IObservable<out T> {
    @JsName("subscribe")
    fun subscribe(observer: IObserver<T>): ISubscription

    @JsName("subscribe")
    fun subscribe(next: NextHandler<T>): ISubscription

    @JsName("subscribe")
    fun subscribe(next: NextHandler<T>?, error: ErrorHandler?): ISubscription

    @JsName("subscribe")
    fun subscribe(next: NextHandler<T>?, error: ErrorHandler?, complete: CompleteHandler?): ISubscription
}
