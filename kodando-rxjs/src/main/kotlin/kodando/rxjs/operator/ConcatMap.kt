package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val concatMap_: JsFunction =
    from("rxjs/operators/concatMap") import "concatMap"


fun <T, TResult> Observable<T>.concatMap(transformer: (T) -> Observable<TResult>): Observable<TResult> {
    return pipe(concatMap_.call(this, transformer))
}
