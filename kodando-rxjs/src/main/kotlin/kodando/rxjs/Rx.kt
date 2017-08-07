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

    /**
     * A subscription contract.
     */
    interface ISubscription {
        /**
         * Disposes the resources held by the subscription.
         * May, for instance, cancel an ongoing Observable execution or cancel any
         * other type of work that started when the Subscription was created.
         */
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


    /**
     * Represents a disposable resource, such as the execution of an Observable.
     * A Subscription has one important method, unsubscribe, that takes no argument and just disposes the resource
     * held by the subscription.
     *
     * Additionally, subscriptions may be grouped together through the add() method, which will attach a child
     * Subscription to the current Subscription. When a Subscription is unsubscribed, all its children
     * (and its grandchildren) will be unsubscribed as well.
     *
     * @see 'http://reactivex.io/rxjs/class/es6/Subscription.js~Subscription.html'
     */
    class Subscription(unsubscribe: () -> Unit) : ISubscription {
        /**
         * A flag to indicate whether this Subscription has already been unsubscribed.
         */
        val closed: Boolean

        /**
         * Adds a tear down to be called during the unsubscribe() of this Subscription.
         */
        fun add(unsubscribe: () -> Unit): ISubscription

        /**
         * Adds a tear down to be called during the unsubscribe() of this Subscription.
         */
        fun add(subscription: ISubscription): ISubscription

        /**
         * emoves a Subscription from the internal list of subscriptions that will unsubscribe during the unsubscribe process of this Subscription.
         */
        fun remove(subscription: ISubscription)

        /**
         * @see ISubscription.unsubscribe()
         */
        override fun unsubscribe()

        companion object {
            val EMPTY: ISubscription
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
