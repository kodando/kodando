@file:Suppress("UnsafeCastFromDynamic", "unused")

package kodando.rxjs

import kotlin.js.*

/**
 * Created by danfma on 03/04/17.
 */

@JsName("map")
fun <T, TResult> Rx.IObservable<T>.map(
    transformer: (T) -> TResult): Rx.IObservable<TResult> =
    this.asDynamic().map(transformer.asDynamic())


@JsName("flatMap")
fun <T, TResult> Rx.IObservable<T>.flatMap(
    transformer: (T) -> Rx.IObservable<TResult>): Rx.IObservable<TResult> =
    this.asDynamic().flatMap(transformer.asDynamic())


@JsName("concatMap")
fun <T, TResult> Rx.IObservable<T>.concatMap(
    transformer: (T) -> Rx.IObservable<TResult>): Rx.IObservable<TResult> =
    this.asDynamic().concatMap(transformer.asDynamic())


@JsName("mergeMap")
fun <T, TResult> Rx.IObservable<T>.mergeMap(
    transformer: (T) -> Rx.IObservable<TResult>): Rx.IObservable<TResult> =
    this.asDynamic().mergeMap(transformer.asDynamic())


@JsName("switchMap")
fun <T, TResult> Rx.IObservable<T>.switchMap(
    transformer: (T) -> Rx.IObservable<TResult>): Rx.IObservable<TResult> =
    this.asDynamic().switchMap(transformer.asDynamic())


@JsName("toArray")
fun <T> Rx.IObservable<T>.toArray(): Rx.IObservable<Array<T>> =
    this.asDynamic().toArray()


@JsName("filter")
fun <T> Rx.IObservable<T>.filter(filter: (T) -> Boolean): Rx.IObservable<T> =
    this.asDynamic().filter(filter.asDynamic())


@JsName("doWithObserver")
fun <T> Rx.IObservable<T>.on(observer: Rx.IObserver<T>): Rx.IObservable<T> =
    this.asDynamic().`do`(observer)


@JsName("do")
fun <T> Rx.IObservable<T>.on(
    next: NextHandler<T>? = null,
    error: ErrorHandler? = null,
    complete: CompleteHandler? = null): Rx.IObservable<T> =
    this.asDynamic().`do`(next, error, complete)


@JsName("scan")
fun <T, TResult> Rx.IObservable<T>.scan(
    handler: (TResult, T) -> TResult,
    seed: TResult): Rx.IObservable<TResult> =
    this.asDynamic().scan(handler.asDynamic(), seed)


@JsName("delay")
fun <T> Rx.IObservable<T>.delay(time: Int): Rx.IObservable<T> =
    this.asDynamic().delay(time)


@JsName("retry")
fun <T> Rx.IObservable<T>.retry(times: Int): Rx.IObservable<T> =
    this.asDynamic().retry(times)


@JsName("distinctUntilChanged")
fun <T> Rx.IObservable<T>.distinctUntilChanged(): Rx.IObservable<T> =
    this.asDynamic().distinctUntilChanged()


@JsName("distinctUntilChangedWithMapper")
fun <T> Rx.IObservable<T>.distinctUntilChanged(mapper: (T) -> Any): Rx.IObservable<T> =
    this.asDynamic().distinctUntilChanged()


@JsName("distinctUntilChangedWithMapperAndEquality")
fun <T, MappedValue> Rx.IObservable<T>.distinctUntilChanged(mapper: (T) -> MappedValue, equalityHandler: (MappedValue, MappedValue) -> Boolean): Rx.IObservable<T> =
    this.asDynamic().distinctUntilChanged()


@JsName("toPromise")
fun <T> Rx.IObservable<T>.toPromise(): Promise<T> =
    this.asDynamic().toPromise()


@JsName("concat")
fun <T> Rx.IObservable<T>.concat(vararg others: Rx.IObservable<T>): Rx.IObservable<T> =
    this.asDynamic().concat.apply(this, others)


@JsName("startWith")
fun <T> Rx.IObservable<T>.startWith(value: T): Rx.IObservable<T> =
    this.asDynamic().startWith(value)


@JsName("mergeAll")
fun <T> Rx.IObservable<Rx.IObservable<T>>.mergeAll(): Rx.IObservable<T> =
    this.asDynamic().mergeAll()


@JsName("debounceTime")
fun <T> Rx.IObservable<T>.debounceTime(timeInMilliseconds: Int): Rx.IObservable<T> =
    this.asDynamic().debounceTime(timeInMilliseconds)


@JsName("ofType")
inline fun <reified R> Rx.IObservable<*>.ofType(): Rx.IObservable<R> =
    this.map { it as? R }
        .filter { it != null }
        .map { it!! }

