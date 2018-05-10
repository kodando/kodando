package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val mergeMap_: JsFunction =
    fromModule("rxjs/operators") import "mergeMap"

fun <T, TResult> Observable<T>.mergeMap(transformer: (T) -> Observable<TResult>): Observable<TResult> {
    return pipe(mergeMap_.call(this, transformer))
}
