package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val throttleTime_: JsFunction =
  fromModule("rxjs/operators") import "throttleTime"


fun <T> Observable<T>.throttleTime(timeInMilliseconds: Int): Observable<T> {
  return pipe(throttleTime_.call(this, timeInMilliseconds))
}
