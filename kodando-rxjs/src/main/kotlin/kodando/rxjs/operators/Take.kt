package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val take_: JsFunction =
  fromModule("rxjs/operators") import "take"


fun <T> Observable<T>.take(count: Int): Observable<T> {
  return pipe(take_.call(this, count))
}
