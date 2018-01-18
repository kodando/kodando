package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val mergeMap_: JsFunction =
    from("rxjs/operators/mergeMap") import "mergeMap"

fun <T, TResult> Observable<T>.mergeMap(transformer: (T) -> Observable<TResult>): Observable<TResult> {
    return pipe(mergeMap_.call(this, transformer))
}
