package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val switchMap_: JsFunction =
    fromModule("rxjs/operators") import "switchMap"


fun <T, TResult> Observable<T>.switchMap(transformer: (T) -> Observable<TResult>): Observable<TResult> {
    return pipe(switchMap_.call(this, transformer))
}
