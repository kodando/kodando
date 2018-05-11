package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val audit_: JsFunction =
  fromModule("rxjs/operators") import "audit"

fun <T> Observable<T>.audit(durationSelector: (T) -> Observable<T>): Observable<T> {
  return pipe(audit_.call(this, durationSelector))
}
