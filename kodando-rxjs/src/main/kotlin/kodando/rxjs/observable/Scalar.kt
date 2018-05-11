package kodando.rxjs.observable

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val scalar_: JsFunction =
  fromModule("rxjs") import "scalar"


fun <T> scalar(value: T): Observable<T> {
  return scalar_.call(null, value)
}
