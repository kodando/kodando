@file:Suppress("UnsafeCastFromDynamic", "unused")

package kodando.rxjs

import kotlin.js.Promise

/**
 * Created by danfma on 03/04/17.
 */

fun <T, TResult> Rx.IObservable<T>.map(
    transformer: (T) -> TResult): Rx.IObservable<TResult> =
    this.asDynamic().map(transformer.asDynamic())

fun <T, TResult> Rx.IObservable<T>.flatMap(
    transformer: (T) -> Rx.IObservable<TResult>): Rx.IObservable<TResult> =
    this.asDynamic().flatMap(transformer.asDynamic())

fun <T, TResult> Rx.IObservable<T>.mergeMap(
    transformer: (T) -> Rx.IObservable<TResult>): Rx.IObservable<TResult> =
    this.asDynamic().mergeMap(transformer.asDynamic())

fun <T, TResult> Rx.IObservable<T>.switchMap(
    transformer: (T) -> Rx.IObservable<TResult>): Rx.IObservable<TResult> =
    this.asDynamic().switchMap(transformer.asDynamic())

fun <T> Rx.IObservable<T>.toArray(): Rx.IObservable<Array<T>> =
    this.asDynamic().toArray()

fun <T> Rx.IObservable<T>.filter(filter: (T) -> Boolean): Rx.IObservable<T> =
    this.asDynamic().filter(filter.asDynamic())

fun <T> Rx.IObservable<T>.on(observer: Rx.IObserver<T>): Rx.IObservable<T> =
    this.asDynamic().`do`(observer)

fun <T> Rx.IObservable<T>.on(
    next: NextHandler<T>? = null,
    error: ErrorHandler? = null,
    complete: CompleteHandler? = null): Rx.IObservable<T> =
    this.asDynamic().`do`(next, error, complete)

fun <T, TResult> Rx.IObservable<T>.scan(
    handler: (TResult, T) -> TResult,
    seed: TResult): Rx.IObservable<TResult> =
    this.asDynamic().scan(handler.asDynamic(), seed)

fun <T> Rx.IObservable<T>.delay(time: Int): Rx.IObservable<T> =
    this.asDynamic().delay(time)

fun <T> Rx.IObservable<T>.retry(times: Int): Rx.IObservable<T> =
    this.asDynamic().retry(times)

fun <T> Rx.IObservable<T>.distinctUntilChanged(): Rx.IObservable<T> =
    this.asDynamic().distinctUntilChanged()

fun <T> Rx.IObservable<T>.distinctUntilChanged(mapper: (T) -> Any): Rx.IObservable<T> =
    this.asDynamic().distinctUntilChanged()

fun <T, MappedValue> Rx.IObservable<T>.distinctUntilChanged(mapper: (T) -> MappedValue, equalityHandler: (MappedValue, MappedValue) -> Boolean): Rx.IObservable<T> =
    this.asDynamic().distinctUntilChanged()

fun <T> Rx.IObservable<T>.toPromise(): Promise<T> =
    this.asDynamic().toPromise()

fun <T> Rx.IObservable<T>.concat(vararg others: Rx.IObservable<T>): Rx.IObservable<T> =
    this.asDynamic().concat.apply(this, others)

fun <T> Rx.IObservable<T>.startWith(value: T): Rx.IObservable<T> =
    this.asDynamic().startWith(value)

fun <T> Rx.IObservable<Rx.IObservable<T>>.mergeAll(): Rx.IObservable<T> =
    this.asDynamic().mergeAll()

fun <T> Rx.IObservable<T>.debounceTime(timeInMilliseconds: Int): Rx.IObservable<T> =
    this.asDynamic().debounceTime(timeInMilliseconds)


inline fun <reified R> Rx.IObservable<*>.ofType(): Rx.IObservable<R> =
    this.map { it as? R }
        .filter { it != null }
        .map { it!! }
