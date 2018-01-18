package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val switchMap_: JsFunction =
    from("rxjs/operators/switchMap") import "switchMap"


fun <T, TResult> Observable<T>.switchMap(transformer: (T) -> Observable<TResult>): Observable<TResult> {
    return pipe(switchMap_.call(this, transformer))
}
