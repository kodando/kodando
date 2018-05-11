package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val startWith_: JsFunction =
  fromModule("rxjs/operators") import "startWith"


fun <T> Observable<T>.startWith(value: T): Observable<T> {
  return pipe(startWith_.call(this, value))
}
