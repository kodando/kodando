@file:Suppress("UnsafeCastFromDynamic", "NOTHING_TO_INLINE")

package kodando.rxjs

import kodando.runtime.JsDate
import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget
import kotlin.js.*

/**
 * Created by danfma on 15/01/2017.
 */

@JsModule("rxjs/Rx")
@JsNonModule
external object Rx {

    interface ISubscription {
        fun unsubscribe()
    }

    interface IObserver<in T> {
        fun next(data: T)
        fun error(error: Error)
        fun complete()
    }

    interface IObservable<out T> {
        @JsName("subscribe")
        fun subscribe(observer: IObserver<T>): ISubscription

        @JsName("subscribe")
        fun subscribe(next: NextHandler<T>): Rx.ISubscription

        @JsName("subscribe")
        fun subscribe(next: NextHandler<T>?, error: ErrorHandler?): Rx.ISubscription

        @JsName("subscribe")
        fun subscribe(next: NextHandler<T>?, error: ErrorHandler?, complete: CompleteHandler?): Rx.ISubscription
    }

    interface ISubject<T> : IObservable<T>, IObserver<T>


    class Subscription(disposer: () -> Unit) : ISubscription {
        override fun unsubscribe()

        companion object {
            val empty: ISubscription
        }
    }


    open class Observable<out T>(publisher: (IObserver<T>) -> Rx.ISubscription?) : IObservable<T> {

        override fun subscribe(observer: IObserver<T>): ISubscription
        override fun subscribe(next: NextHandler<T>): ISubscription
        override fun subscribe(next: NextHandler<T>?, error: ErrorHandler?): ISubscription
        override fun subscribe(next: NextHandler<T>?, error: ErrorHandler?, complete: CompleteHandler?): ISubscription

        companion object {

            @JsName("create")
            fun <T> create(producer: (Rx.IObserver<T>) -> Unit): Rx.IObservable<T>

            @JsName("create")
            fun <T> createWithSubscription(producer: (Rx.IObserver<T>) -> Rx.ISubscription): Rx.IObservable<T>

            @JsName("of")
            fun <T> of(vararg value: T): Rx.IObservable<T>

            @JsName("from")
            fun <T> from(promise: Promise<T>): Rx.IObservable<T>

            @JsName("from")
            fun <T> from(promise: Array<T>): Rx.IObservable<T>

            @JsName("from")
            fun <T> from(promise: Rx.IObservable<T>): Rx.IObservable<T>

            @JsName("fromEvent")
            fun <T : Event> fromEvent(target: EventTarget, eventName: String): Rx.IObservable<T>

            @JsName("fromPromise")
            fun <T> fromPromise(promise: Promise<T>): Rx.IObservable<T>

            @JsName("interval")
            fun interval(period: Int): Rx.IObservable<Int>

            @JsName("merge")
            fun <T> merge(vararg observables: IObservable<T>): Rx.IObservable<T>

            @JsName("throw")
            fun throwError(error: Error): Rx.IObservable<*>

            @JsName("empty")
            fun <T> empty(): Rx.IObservable<T>

            @JsName("range")
            fun range(start: Int, count: Int): Rx.IObservable<Int>

            @JsName("timer")
            fun timer(initialDelay: Int, period: Int): Rx.IObservable<Int>

            @JsName("timer")
            fun timer(initialDelay: Date, period: Int): Rx.IObservable<Int>

            @JsName("timer")
            fun timer(initialDelay: JsDate, period: Int): Rx.IObservable<Int>
        }
    }


    open class Subject<T> : ISubject<T> {
        override fun next(data: T)
        override fun error(error: Error)
        override fun complete()
        override fun subscribe(observer: IObserver<T>): ISubscription
        override fun subscribe(next: NextHandler<T>): ISubscription
        override fun subscribe(next: NextHandler<T>?, error: ErrorHandler?): ISubscription
        override fun subscribe(next: NextHandler<T>?, error: ErrorHandler?, complete: CompleteHandler?): ISubscription
    }

    open class BehaviorSubject<T>(initialValue: T) : ISubject<T> {
        val value: T
        override fun next(data: T)
        override fun error(error: Error)
        override fun complete()
        override fun subscribe(observer: IObserver<T>): ISubscription
        override fun subscribe(next: NextHandler<T>): ISubscription
        override fun subscribe(next: NextHandler<T>?, error: ErrorHandler?): ISubscription
        override fun subscribe(next: NextHandler<T>?, error: ErrorHandler?, complete: CompleteHandler?): ISubscription
    }

}
