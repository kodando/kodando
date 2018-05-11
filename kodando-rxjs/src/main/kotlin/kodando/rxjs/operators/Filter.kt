package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val filter_: JsFunction =
  fromModule("rxjs/operators") import "filter"

fun <T> Observable<T>.filter(predicate: (T) -> Boolean): Observable<T> {
  return pipe(filter_.call(this, predicate))
}
