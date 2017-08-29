@file:Suppress("UnsafeCastFromDynamic", "unused")

package kodando.rxjs

import kodando.runtime.Tuple2
import kodando.runtime.Tuple3
import kotlin.js.*
import kotlin.reflect.KClass

/**
 * Created by danfma on 03/04/17.
 */

@JsName("map")
inline fun <T, TResult> Subscribable<T>.map(transformer: (T) -> TResult): Subscribable<TResult> =
    this.asDynamic().map(transformer.asDynamic())


@JsName("flatMap")
inline fun <T, TResult> Subscribable<T>.flatMap(transformer: (T) -> Subscribable<TResult>): Subscribable<TResult> =
    this.asDynamic().flatMap(transformer.asDynamic())


@JsName("mergeMap")
inline fun <T, TResult> Subscribable<T>.mergeMap(transformer: (T) -> Subscribable<TResult>): Subscribable<TResult> =
    this.asDynamic().mergeMap(transformer.asDynamic())


@JsName("switchMap")
inline fun <T, TResult> Subscribable<T>.switchMap(transformer: (T) -> Subscribable<TResult>): Subscribable<TResult> =
    this.asDynamic().switchMap(transformer.asDynamic())


@JsName("toArray")
inline fun <T> Subscribable<T>.toArray(): Subscribable<Array<T>> =
    this.asDynamic().toArray()


@JsName("filter")
inline fun <T> Subscribable<T>.filter(filter: (T) -> Boolean): Subscribable<T> =
    this.asDynamic().filter(filter.asDynamic())


@JsName("doWithObserver")
inline fun <T> Subscribable<T>.on(observer: Observer<T>): Subscribable<T> =
    this.asDynamic().`do`(observer)


@JsName("do")
fun <T> Subscribable<T>.on(
    next: NextHandler<T>? = null,
    error: ErrorHandler? = null,
    complete: CompleteHandler? = null): Subscribable<T> =
    this.asDynamic().`do`(next, error, complete)


@JsName("scan")
inline fun <T, TResult> Subscribable<T>.scan(
    handler: (TResult, T) -> TResult,
    seed: TResult): Subscribable<TResult> =
    this.asDynamic().scan(handler.asDynamic(), seed)


@JsName("delay")
inline fun <T> Subscribable<T>.delay(time: Int): Subscribable<T> =
    this.asDynamic().delay(time)


@JsName("retry")
inline fun <T> Subscribable<T>.retry(times: Int): Subscribable<T> =
    this.asDynamic().retry(times)


@JsName("distinctUntilChanged")
inline fun <T> Subscribable<T>.distinctUntilChanged(): Subscribable<T> =
    this.asDynamic().distinctUntilChanged()


@JsName("distinctUntilChangedWithMapper")
inline fun <T> Subscribable<T>.distinctUntilChanged(mapper: (T) -> Any): Subscribable<T> =
    this.asDynamic().distinctUntilChanged()


@JsName("distinctUntilChangedWithMapperAndEquality")
inline fun <T, MappedValue> Subscribable<T>.distinctUntilChanged(mapper: (T) -> MappedValue,
                                                                 equalityHandler: (MappedValue, MappedValue) -> Boolean): Subscribable<T> =
    this.asDynamic().distinctUntilChanged()


@JsName("toPromise")
inline fun <T> Subscribable<T>.toPromise(): Promise<T> =
    this.asDynamic().toPromise()


@JsName("startWith")
inline fun <T> Subscribable<T>.startWith(value: T): Subscribable<T> =
    this.asDynamic().startWith(value)


@JsName("mergeAll")
inline fun <T> Subscribable<Subscribable<T>>.mergeAll(): Subscribable<T> =
    this.asDynamic().mergeAll()


@JsName("debounceTime")
inline fun <T> Subscribable<T>.debounceTime(timeInMilliseconds: Int): Subscribable<T> =
    this.asDynamic().debounceTime(timeInMilliseconds)


// Combination

@JsName("combineAll")
inline fun <T> Subscribable<out Subscribable<T>>.combineAll(): Subscribable<Array<T>> =
    this.asDynamic().combineAll()


@JsName("combineLatest1")
inline fun <T, TOther1> Subscribable<T>.combineLatest(other: Subscribable<TOther1>): Subscribable<Array<Tuple2<T, TOther1>>> =
    this.asDynamic().combineLatest(other)


@JsName("combineLatest1AndProject")
fun <T, TOther, TResult> Subscribable<T>.combineLatest(
    source1: Subscribable<TOther>,
    projection: (T, TOther) -> TResult): Subscribable<TResult> =
    this.asDynamic().combineLatest(source1, projection)


@JsName("combineLatest2")
inline fun <T, T1, T2> Subscribable<T>.combineLatest(source1: Subscribable<T1>,
                                                     source2: Subscribable<T2>): Subscribable<Array<Tuple3<T, T1, T2>>> =
    this.asDynamic().combineLatest(source1, source2)


@JsName("combineLatest2AndProject")
fun <T, T1, T2, TResult> Subscribable<T>.combineLatest(
    source1: Subscribable<T1>,
    source2: Subscribable<T2>,
    projection: (T, T1, T2) -> TResult): Subscribable<TResult> =
    this.asDynamic().combineLatest(source1, source2, projection)


@JsName("combineLatest")
inline fun <T> Subscribable<T>.combineLatest(vararg others: Subscribable<*>): Subscribable<Array<Any>> =
    this.asDynamic().combineLatest()


@JsName("concat")
inline fun <T> Subscribable<T>.concat(vararg others: Subscribable<T>): Subscribable<T> =
    this.asDynamic().concat.apply(this, others)


@JsName("concatAll")
inline fun <T> Subscribable<Subscribable<T>>.concatAll(): Subscribable<Array<T>> =
    this.asDynamic().concatAll()


// Transformation


@JsName("concatMap")
inline fun <T, TResult> Subscribable<T>.concatMap(transformer: (T) -> Subscribable<TResult>): Subscribable<TResult> =
    this.asDynamic().concatMap(transformer.asDynamic())


// Filters

@JsName("take")
inline fun <T> Subscribable<T>.take(count: Int): Subscribable<T> =
    this.asDynamic().take(count)


// Custom

@JsName("ofType")
inline fun <reified R> Subscribable<*>.ofType(): Subscribable<R> =
    this.map { it as? R }
        .filter { it != null }
        .map { it!! }

@JsName("ofTypeOfClass")
inline fun <R : Any> Subscribable<*>.ofType(type: KClass<R>): Subscribable<R> =
    this.filter { type.isInstance(it) }
        .map { it as R }
