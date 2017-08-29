@file: JsModule("rxjs/Rx")
@file: JsNonModule
@file:Suppress("unused")

package kodando.rxjs

external open class Subscriber<in T>(subscription: MaybeObserverOrHandler<T>,
                                     error: ErrorHandler? = definedExternally,
                                     complete: CompleteHandler? = definedExternally) : Subscription, Observer<T> {

    constructor(observer: Observer<T>)

    constructor(nextHandler: NextHandler<T>? = definedExternally,
                error: ErrorHandler? = definedExternally,
                complete: CompleteHandler? = definedExternally)

    override fun next(data: T)
    override fun error(error: Error)
    override fun complete()

    companion object {
        @JsName("create")
        fun <T> create(next: NextHandler<T>): Subscriber<T>

        @JsName("create")
        fun <T> create(next: NextHandler<T>?, error: ErrorHandler): Subscriber<T>

        @JsName("create")
        fun <T> create(next: NextHandler<T>?, error: ErrorHandler?, complete: CompleteHandler): Subscriber<T>
    }
}