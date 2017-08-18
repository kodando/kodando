package kodando.rxjs

import kodando.runtime.JsDate
import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget
import kotlin.js.Date
import kotlin.js.Promise

external open class Observable<out T>(publisher: (IObserver<T>) -> ISubscription?) : IObservable<T> {

    override fun subscribe(observer: IObserver<T>): ISubscription
    override fun subscribe(next: NextHandler<T>): ISubscription
    override fun subscribe(next: NextHandler<T>?, error: ErrorHandler?): ISubscription
    override fun subscribe(next: NextHandler<T>?, error: ErrorHandler?, complete: CompleteHandler?): ISubscription

    companion object {

        @JsName("create")
        fun <T> create(producer: (IObserver<T>) -> Unit): IObservable<T>

        @JsName("create")
        fun <T> createWithSubscription(producer: (IObserver<T>) -> ISubscription): IObservable<T>

        @JsName("of")
        fun <T> of(vararg value: T): IObservable<T>

        @JsName("from")
        fun <T> from(promise: Promise<T>): IObservable<T>

        @JsName("from")
        fun <T> from(promise: Array<T>): IObservable<T>

        @JsName("from")
        fun <T> from(promise: IObservable<T>): IObservable<T>

        @JsName("fromEvent")
        fun <T : Event> fromEvent(target: EventTarget, eventName: String): IObservable<T>

        @JsName("fromPromise")
        fun <T> fromPromise(promise: Promise<T>): IObservable<T>

        @JsName("interval")
        fun interval(period: Int): IObservable<Int>

        @JsName("merge")
        fun <T> merge(vararg observables: IObservable<T>): IObservable<T>

        @JsName("throw")
        fun <T> throwError(error: Error): IObservable<T>

        @JsName("empty")
        fun <T> empty(): IObservable<T>

        @JsName("range")
        fun range(start: Int, count: Int): IObservable<Int>

        @JsName("timer")
        fun timer(initialDelay: Int, period: Int): IObservable<Int>

        @JsName("timer")
        fun timer(initialDelay: Date, period: Int): IObservable<Int>

        @JsName("timer")
        fun timer(initialDelay: JsDate, period: Int): IObservable<Int>
    }
}
