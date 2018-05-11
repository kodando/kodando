package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val concatMap_: JsFunction =
  fromModule("rxjs/operators") import "concatMap"


fun <T, TResult> Observable<T>.concatMap(transformer: (T) -> Observable<TResult>): Observable<TResult> {
  return pipe(concatMap_.call(this, transformer))
}
