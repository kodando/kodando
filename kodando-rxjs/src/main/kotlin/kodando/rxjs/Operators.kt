@file:Suppress("UnsafeCastFromDynamic", "unused")

package kodando.rxjs

import kodando.runtime.Tuple2
import kodando.runtime.Tuple3
import kotlin.js.*

/**
 * Created by danfma on 03/04/17.
 */

@JsName("map")
inline fun <T, TResult> IObservable<T>.map(
    transformer: (T) -> TResult): IObservable<TResult> =
    this.asDynamic().map(transformer.asDynamic())


@JsName("flatMap")
inline fun <T, TResult> IObservable<T>.flatMap(
    transformer: (T) -> IObservable<TResult>): IObservable<TResult> =
    this.asDynamic().flatMap(transformer.asDynamic())


@JsName("mergeMap")
inline fun <T, TResult> IObservable<T>.mergeMap(
    transformer: (T) -> IObservable<TResult>): IObservable<TResult> =
    this.asDynamic().mergeMap(transformer.asDynamic())


@JsName("switchMap")
inline fun <T, TResult> IObservable<T>.switchMap(
    transformer: (T) -> IObservable<TResult>): IObservable<TResult> =
    this.asDynamic().switchMap(transformer.asDynamic())


@JsName("toArray")
inline fun <T> IObservable<T>.toArray(): IObservable<Array<T>> =
    this.asDynamic().toArray()


@JsName("filter")
inline fun <T> IObservable<T>.filter(filter: (T) -> Boolean): IObservable<T> =
    this.asDynamic().filter(filter.asDynamic())


@JsName("doWithObserver")
inline fun <T> IObservable<T>.on(observer: IObserver<T>): IObservable<T> =
    this.asDynamic().`do`(observer)


@JsName("do")
fun <T> IObservable<T>.on(
    next: NextHandler<T>? = null,
    error: ErrorHandler? = null,
    complete: CompleteHandler? = null): IObservable<T> =
    this.asDynamic().`do`(next, error, complete)


@JsName("scan")
inline fun <T, TResult> IObservable<T>.scan(
    handler: (TResult, T) -> TResult,
    seed: TResult): IObservable<TResult> =
    this.asDynamic().scan(handler.asDynamic(), seed)


@JsName("delay")
inline fun <T> IObservable<T>.delay(time: Int): IObservable<T> =
    this.asDynamic().delay(time)


@JsName("retry")
inline fun <T> IObservable<T>.retry(times: Int): IObservable<T> =
    this.asDynamic().retry(times)


@JsName("distinctUntilChanged")
inline fun <T> IObservable<T>.distinctUntilChanged(): IObservable<T> =
    this.asDynamic().distinctUntilChanged()


@JsName("distinctUntilChangedWithMapper")
inline fun <T> IObservable<T>.distinctUntilChanged(mapper: (T) -> Any): IObservable<T> =
    this.asDynamic().distinctUntilChanged()


@JsName("distinctUntilChangedWithMapperAndEquality")
inline fun <T, MappedValue> IObservable<T>.distinctUntilChanged(mapper: (T) -> MappedValue, equalityHandler: (MappedValue, MappedValue) -> Boolean): IObservable<T> =
    this.asDynamic().distinctUntilChanged()


@JsName("toPromise")
inline fun <T> IObservable<T>.toPromise(): Promise<T> =
    this.asDynamic().toPromise()


@JsName("startWith")
inline fun <T> IObservable<T>.startWith(value: T): IObservable<T> =
    this.asDynamic().startWith(value)


@JsName("mergeAll")
inline fun <T> IObservable<IObservable<T>>.mergeAll(): IObservable<T> =
    this.asDynamic().mergeAll()


@JsName("debounceTime")
inline fun <T> IObservable<T>.debounceTime(timeInMilliseconds: Int): IObservable<T> =
    this.asDynamic().debounceTime(timeInMilliseconds)


// Combination

@JsName("combineAll")
inline fun <T> IObservable<IObservable<T>>.combineAll(): IObservable<Array<T>> =
    this.asDynamic().combineAll()


@JsName("combineLatest1")
inline fun <T, TOther1> IObservable<T>.combineLatest(other: IObservable<TOther1>): IObservable<Array<Tuple2<T, TOther1>>> =
    this.asDynamic().combineLatest(other)


@JsName("combineLatest1AndProject")
fun <T, TOther, TResult> IObservable<T>.combineLatest(
    source1: IObservable<TOther>,
    projection: (T, TOther) -> TResult): IObservable<TResult> =
    this.asDynamic().combineLatest(source1, projection)


@JsName("combineLatest2")
inline fun <T, T1, T2> IObservable<T>.combineLatest(source1: IObservable<T1>, source2: IObservable<T2>): IObservable<Array<Tuple3<T, T1, T2>>> =
    this.asDynamic().combineLatest(source1, source2)


@JsName("combineLatest2AndProject")
fun <T, T1, T2, TResult> IObservable<T>.combineLatest(
    source1: IObservable<T1>,
    source2: IObservable<T2>,
    projection: (T, T1, T2) -> TResult): IObservable<TResult> =
    this.asDynamic().combineLatest(source1, source2, projection)


@JsName("combineLatest")
inline fun <T> IObservable<T>.combineLatest(vararg others: IObservable<*>): IObservable<Array<Any>> =
    this.asDynamic().combineLatest()


@JsName("concat")
inline fun <T> IObservable<T>.concat(vararg others: IObservable<T>): IObservable<T> =
    this.asDynamic().concat.apply(this, others)


@JsName("concatAll")
inline fun <T> IObservable<IObservable<T>>.concatAll(): IObservable<Array<T>> =
    this.asDynamic().concatAll()


// Transformation


@JsName("concatMap")
inline fun <T, TResult> IObservable<T>.concatMap(
    transformer: (T) -> IObservable<TResult>): IObservable<TResult> =
    this.asDynamic().concatMap(transformer.asDynamic())


// Filters

@JsName("take")
inline fun <T> IObservable<T>.take(count: Int): IObservable<T> =
    this.asDynamic().take(count)


// Custom

@JsName("ofType")
inline fun <reified R> IObservable<*>.ofType(): IObservable<R> =
    this.map { it as? R }
        .filter { it != null }
        .map { it!! }

