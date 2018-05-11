@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.observable

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import
import kodando.rxjs.scheduler.Scheduler

private val concat_: JsFunction =
  fromModule("rxjs") import "concat"


fun <T> concat(vararg observables: Observable<T>): Observable<T> {
  return concat_.apply(null, observables)
}

fun <T> concat(vararg observables: Observable<T>, scheduler: Scheduler): Observable<T> {
  return concat_.apply(null, observables + scheduler)
}
