@file: JsModule("rxjs/Rx")
@file: JsNonModule

package kodando.rxjs

import kodando.runtime.JsDate
import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget
import kotlin.js.*

external open class Observable<T>(publisher: (Observer<T>) -> AnonymousSubscription?) : Subscribable<T> {

    override fun subscribe(observer: MaybeObserverOrHandler<T>): AnonymousSubscription

    companion object : ObservableStatic {

        @JsName("create")
        fun <T> create(producer: (Observer<T>) -> Unit): Observable<T>

        @JsName("create")
        fun <T> createWithSubscription(producer: (Observer<T>) -> AnonymousSubscription): Observable<T>

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

        @JsName("throw")
        fun <T> throwError(error: Error): Observable<T>

        @JsName("range")
        fun range(start: Int, count: Int): Observable<Int>

        @JsName("timer")
        fun timer(initialDelay: Int, period: Int): Observable<Int>

        @JsName("timer")
        fun timer(initialDelay: Date, period: Int): Observable<Int>

        @JsName("timer")
        fun timer(initialDelay: JsDate, period: Int): Observable<Int>
    }
}

