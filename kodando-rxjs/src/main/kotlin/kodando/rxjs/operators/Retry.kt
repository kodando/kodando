package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val retry_: JsFunction =
  fromModule("rxjs/operators") import "retry"


fun <T> Observable<T>.retry(times: Int): Observable<T> {
  return pipe(retry_.call(this, times))
}
