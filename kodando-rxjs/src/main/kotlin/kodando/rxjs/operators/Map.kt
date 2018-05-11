package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val map_: JsFunction =
  fromModule("rxjs/operators") import "map"


fun <T, TResult> Observable<T>.map(transformer: (T) -> TResult): Observable<TResult> {
  return pipe(map_.call(this, transformer))
}
