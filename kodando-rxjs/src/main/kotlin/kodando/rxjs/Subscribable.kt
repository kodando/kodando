package kodando.rxjs

external interface Subscribable<T> {
    @JsName("subscribe")
    fun subscribe(observer: MaybeObserverOrHandler<T>): Unsubscribable
}
