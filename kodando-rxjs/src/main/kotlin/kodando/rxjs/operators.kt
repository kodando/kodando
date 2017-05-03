@file:Suppress("UnsafeCastFromDynamic", "unused")

package kodando.rxjs

import kodando.runtime.Tuple2
import kodando.runtime.Tuple3
import kotlin.js.*

/**
 * Created by danfma on 03/04/17.
 */

@JsName("map")
inline fun <T, TResult> Rx.IObservable<T>.map(
    transformer: (T) -> TResult): Rx.IObservable<TResult> =
    this.asDynamic().map(transformer.asDynamic())


@JsName("flatMap")
inline fun <T, TResult> Rx.IObservable<T>.flatMap(
    transformer: (T) -> Rx.IObservable<TResult>): Rx.IObservable<TResult> =
    this.asDynamic().flatMap(transformer.asDynamic())


@JsName("mergeMap")
inline fun <T, TResult> Rx.IObservable<T>.mergeMap(
    transformer: (T) -> Rx.IObservable<TResult>): Rx.IObservable<TResult> =
    this.asDynamic().mergeMap(transformer.asDynamic())


@JsName("switchMap")
inline fun <T, TResult> Rx.IObservable<T>.switchMap(
    transformer: (T) -> Rx.IObservable<TResult>): Rx.IObservable<TResult> =
    this.asDynamic().switchMap(transformer.asDynamic())


@JsName("toArray")
inline fun <T> Rx.IObservable<T>.toArray(): Rx.IObservable<Array<T>> =
    this.asDynamic().toArray()


@JsName("filter")
inline fun <T> Rx.IObservable<T>.filter(filter: (T) -> Boolean): Rx.IObservable<T> =
    this.asDynamic().filter(filter.asDynamic())


@JsName("doWithObserver")
inline fun <T> Rx.IObservable<T>.on(observer: Rx.IObserver<T>): Rx.IObservable<T> =
    this.asDynamic().`do`(observer)


@JsName("do")
fun <T> Rx.IObservable<T>.on(
    next: NextHandler<T>? = null,
    error: ErrorHandler? = null,
    complete: CompleteHandler? = null): Rx.IObservable<T> =
    this.asDynamic().`do`(next, error, complete)


@JsName("scan")
inline fun <T, TResult> Rx.IObservable<T>.scan(
    handler: (TResult, T) -> TResult,
    seed: TResult): Rx.IObservable<TResult> =
    this.asDynamic().scan(handler.asDynamic(), seed)


@JsName("delay")
inline fun <T> Rx.IObservable<T>.delay(time: Int): Rx.IObservable<T> =
    this.asDynamic().delay(time)


@JsName("retry")
inline fun <T> Rx.IObservable<T>.retry(times: Int): Rx.IObservable<T> =
    this.asDynamic().retry(times)


@JsName("distinctUntilChanged")
inline fun <T> Rx.IObservable<T>.distinctUntilChanged(): Rx.IObservable<T> =
    this.asDynamic().distinctUntilChanged()


@JsName("distinctUntilChangedWithMapper")
inline fun <T> Rx.IObservable<T>.distinctUntilChanged(mapper: (T) -> Any): Rx.IObservable<T> =
    this.asDynamic().distinctUntilChanged()


@JsName("distinctUntilChangedWithMapperAndEquality")
inline fun <T, MappedValue> Rx.IObservable<T>.distinctUntilChanged(mapper: (T) -> MappedValue, equalityHandler: (MappedValue, MappedValue) -> Boolean): Rx.IObservable<T> =
    this.asDynamic().distinctUntilChanged()


@JsName("toPromise")
inline fun <T> Rx.IObservable<T>.toPromise(): Promise<T> =
    this.asDynamic().toPromise()


@JsName("startWith")
inline fun <T> Rx.IObservable<T>.startWith(value: T): Rx.IObservable<T> =
    this.asDynamic().startWith(value)


@JsName("mergeAll")
inline fun <T> Rx.IObservable<Rx.IObservable<T>>.mergeAll(): Rx.IObservable<T> =
    this.asDynamic().mergeAll()


@JsName("debounceTime")
inline fun <T> Rx.IObservable<T>.debounceTime(timeInMilliseconds: Int): Rx.IObservable<T> =
    this.asDynamic().debounceTime(timeInMilliseconds)


// Combination

@JsName("combineAll")
inline fun <T> Rx.IObservable<Rx.IObservable<T>>.combineAll(): Rx.IObservable<Array<T>> =
    this.asDynamic().combineAll()


@JsName("combineLatest1")
inline fun <T, TOther1> Rx.IObservable<T>.combineLatest(other: Rx.IObservable<TOther1>): Rx.IObservable<Array<Tuple2<T, TOther1>>> =
    this.asDynamic().combineLatest(other)


@JsName("combineLatest1AndProject")
fun <T, TOther, TResult> Rx.IObservable<T>.combineLatest(
    source1: Rx.IObservable<TOther>,
    projection: (T, TOther) -> TResult): Rx.IObservable<TResult> =
    this.asDynamic().combineLatest(source1, projection)


@JsName("combineLatest2")
inline fun <T, T1, T2> Rx.IObservable<T>.combineLatest(source1: Rx.IObservable<T1>, source2: Rx.IObservable<T2>): Rx.IObservable<Array<Tuple3<T, T1, T2>>> =
    this.asDynamic().combineLatest(source1, source2)


@JsName("combineLatest2AndProject")
fun <T, T1, T2, TResult> Rx.IObservable<T>.combineLatest(
    source1: Rx.IObservable<T1>,
    source2: Rx.IObservable<T2>,
    projection: (T, T1, T2) -> TResult): Rx.IObservable<TResult> =
    this.asDynamic().combineLatest(source1, source2, projection)


@JsName("combineLatest")
inline fun <T> Rx.IObservable<T>.combineLatest(vararg others: Rx.IObservable<*>): Rx.IObservable<Array<Any>> =
    this.asDynamic().combineLatest()


@JsName("concat")
inline fun <T> Rx.IObservable<T>.concat(vararg others: Rx.IObservable<T>): Rx.IObservable<T> =
    this.asDynamic().concat.apply(this, others)


@JsName("concatAll")
inline fun <T> Rx.IObservable<Rx.IObservable<T>>.concatAll(): Rx.IObservable<Array<T>> =
    this.asDynamic().concatAll()


// Transformation


@JsName("concatMap")
inline fun <T, TResult> Rx.IObservable<T>.concatMap(
    transformer: (T) -> Rx.IObservable<TResult>): Rx.IObservable<TResult> =
    this.asDynamic().concatMap(transformer.asDynamic())


// Filters

@JsName("take")
inline fun <T> Rx.IObservable<T>.take(count: Int): Rx.IObservable<T> =
    this.asDynamic().take(count)


// Custom

@JsName("ofType")
inline fun <reified R> Rx.IObservable<*>.ofType(): Rx.IObservable<R> =
    this.map { it as? R }
        .filter { it != null }
        .map { it!! }

