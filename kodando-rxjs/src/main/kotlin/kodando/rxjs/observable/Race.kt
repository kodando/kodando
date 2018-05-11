@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.observable

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val race_: JsFunction =
  fromModule("rxjs") import "race"


fun <T> race(observables: Array<Observable<T>>): Observable<T> {
  return race_.call(null, observables)
}

fun <T> race(vararg observables: Array<Observable<T>>): Observable<T> {
  return race_.call(null, observables)
}
