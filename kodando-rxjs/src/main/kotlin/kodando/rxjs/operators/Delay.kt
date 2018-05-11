package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val delay_: JsFunction =
  fromModule("rxjs/operators") import "delay"


fun <T> Observable<T>.delay(time: Int): Observable<T> {
  return pipe(delay_.call(this, time))
}
