package kodando.rxjs.observable

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val of_: JsFunction =
  fromModule("rxjs") import "of"

fun <T> of(vararg values: T): Observable<T> {
  return of_.apply(null, values)
}
