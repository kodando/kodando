@file: JsModule("rxjs/Observable")

package kodando.rxjs

import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget
import kotlin.js.Promise

external open class Observable<T>(publisher: (Observer<T>) -> Unsubscribable?) : Subscribable<T> {

    override fun subscribe(observer: MaybeObserverOrHandler<T>): Unsubscribable

    companion object : ObservableStatic {

        @JsName("create")
        fun <T> create(producer: (Observer<T>) -> Unit): Observable<T>

        @JsName("create")
        fun <T> createWithSubscription(producer: (Observer<T>) -> Unsubscribable): Observable<T>

        @JsName("of")
        fun <T> of(vararg value: T): Observable<T>

        @JsName("from")
        fun <T> from(promise: Promise<T>): Observable<T>

        @JsName("from")
        fun <T> from(promise: Array<T>): Observable<T>

        @JsName("from")
        fun <T> from(promise: Observable<T>): Observable<T>

        @JsName("fromEvent")
        fun <T : Event> fromEvent(target: EventTarget, eventName: String): Observable<T>

        @JsName("fromPromise")
        fun <T> fromPromise(promise: Promise<T>): Observable<T>
    }
}

