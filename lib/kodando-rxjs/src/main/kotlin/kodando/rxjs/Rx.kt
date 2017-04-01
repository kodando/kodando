@file:Suppress("UnsafeCastFromDynamic", "NOTHING_TO_INLINE")

package kodando.rxjs

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
        fun subscribe(observer: IObserver<T>): ISubscription
    }

    interface ISubject<T> : IObservable<T>, IObserver<T>


    class Subscription(disposer: () -> Unit) : ISubscription {
        override fun unsubscribe()

        companion object {
            val empty: ISubscription
        }
    }


    open class Observable<out T>(publisher: (IObserver<T>) -> ISubscription?) : IObservable<T> {

        override fun subscribe(observer: IObserver<T>): ISubscription

        companion object {

            @JsName("of")
            fun <T> of(value: T): IObservable<T>

            @JsName("from")
            fun <T> from(promise: Promise<T>): IObservable<T>

            @JsName("from")
            fun <T> from(promise: Array<T>): IObservable<T>

            @JsName("from")
            fun <T> from(promise: IObservable<T>): IObservable<T>

            @JsName("merge")
            fun <T> merge(vararg observables: IObservable<T>): IObservable<T>

            @JsName("throw")
            fun throwError(error: Error): IObservable<*>
        }
    }


    open class Subject<T> : ISubject<T> {
        override fun next(data: T)
        override fun error(error: Error)
        override fun complete()
        override fun subscribe(observer: IObserver<T>): ISubscription
    }

    open class BehaviorSubject<T>(initialValue: T) : ISubject<T> {
        val value: T
        override fun next(data: T)
        override fun error(error: Error)
        override fun complete()
        override fun subscribe(observer: IObserver<T>): ISubscription
    }

}

typealias NextHandler<T> = (T) -> Unit
typealias ErrorHandler = (Any) -> Unit
typealias CompleteHandler = () -> Unit

inline fun <T> Rx.IObservable<T>.subscribe(
    noinline next: NextHandler<T>? = null,
    noinline error: ErrorHandler? = null,
    noinline complete: CompleteHandler? = null): Rx.ISubscription =
    this.asDynamic().`subscribe`(next, error, complete)

inline fun <T, TResult> Rx.IObservable<T>.map(
    transformer: (T) -> TResult): Rx.IObservable<TResult> =
    this.asDynamic().map(transformer.asDynamic())

inline fun <T, TResult> Rx.IObservable<T>.flatMap(
    transformer: (T) -> Rx.IObservable<TResult>): Rx.IObservable<TResult> =
    this.asDynamic().flatMap(transformer.asDynamic())

inline fun <T, TResult> Rx.IObservable<T>.mergeMap(
    transformer: (T) -> Rx.IObservable<TResult>): Rx.IObservable<TResult> =
    this.asDynamic().mergeMap(transformer.asDynamic())

inline fun <T, TResult> Rx.IObservable<T>.switchMap(
    transformer: (T) -> Rx.IObservable<TResult>): Rx.IObservable<TResult> =
    this.asDynamic().switchMap(transformer.asDynamic())

inline fun <T> Rx.IObservable<T>.toArray(): Rx.IObservable<Array<T>> =
    this.asDynamic().toArray()

inline fun <T> Rx.IObservable<T>.filter(filter: (T) -> Boolean): Rx.IObservable<T> =
    this.asDynamic().filter(filter.asDynamic())

inline fun <T> Rx.IObservable<T>.on(observer: Rx.IObserver<T>): Rx.IObservable<T> =
    this.asDynamic().`do`(observer)

inline fun <T> Rx.IObservable<T>.on(
    noinline next: NextHandler<T>? = null,
    noinline error: ErrorHandler? = null,
    noinline complete: CompleteHandler? = null): Rx.IObservable<T> =
    this.asDynamic().`do`(next, error, complete)

inline fun <T, TResult> Rx.IObservable<T>.scan(
    handler: (TResult, T) -> TResult,
    seed: TResult): Rx.IObservable<TResult> =
    this.asDynamic().scan(handler.asDynamic(), seed)

inline fun <T> Rx.IObservable<T>.delay(time: Int): Rx.IObservable<T> =
    this.asDynamic().delay(time)

inline fun <T> Rx.IObservable<T>.take(count: Int): Rx.IObservable<T> =
    this.asDynamic().take(count)

inline fun <T> Rx.IObservable<T>.toPromise(): Promise<T> =
    this.asDynamic().toPromise()

inline fun <T> Rx.IObservable<T>.concat(vararg others: Rx.IObservable<T>): Rx.IObservable<T> =
    this.asDynamic().concat.apply(this, others)

inline fun <T> Rx.IObservable<T>.startWith(value: T): Rx.IObservable<T> =
    this.asDynamic().startWith(value)

inline fun <T> Rx.IObservable<Rx.IObservable<T>>.mergeAll(): Rx.IObservable<T> =
    this.asDynamic().mergeAll()

inline fun <T> Rx.IObservable<T>.debounceTime(timeInMilliseconds: Int): Rx.IObservable<T> =
    this.asDynamic().debounceTime(timeInMilliseconds)

inline fun <reified R> Rx.IObservable<*>.ofType(): Rx.IObservable<R> =
    this.map { it as? R }
        .filter { it != null }
        .map { it!! }