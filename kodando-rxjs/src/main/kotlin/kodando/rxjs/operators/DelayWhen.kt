package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val delayWhen_: JsFunction =
  fromModule("rxjs/operators") import "delayWhen"


fun <T> Observable<T>.delayWhen(
  delayDurationSelector: (value: T) -> Observable<*>,
  subscriptionDelay: Observable<*>? = null): Observable<T> {

  return pipe(delayWhen_.call(this, delayDurationSelector, subscriptionDelay))
}
