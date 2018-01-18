package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val combineLatest_: JsFunction =
    from("rxjs/operators/combineLatest") import "combineLatest"


fun <T, TOther, TResult> Observable<T>.combineLatest(
    source1: Observable<TOther>,
    projection: (T, TOther) -> TResult): Observable<TResult> {

    return pipe(combineLatest_.call(this, source1, projection))
}


fun <T, T1, T2, TResult> Observable<T>.combineLatest(
    source1: Observable<T1>,
    source2: Observable<T2>,
    projection: (T, T1, T2) -> TResult): Observable<TResult> {

    return pipe(combineLatest_.call(this, source1, source2, projection))
}


fun <T> Observable<T>.combineLatest(vararg others: Observable<*>): Observable<Array<Any>> {
    return pipe(combineLatest_.apply(this, others))
}
