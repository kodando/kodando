@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.observable

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import
import kotlin.js.Date

private val timer_: JsFunction =
  fromModule("rxjs") import "timer"


fun timer(initialDelay: Int, period: Int): Observable<Int> {
  return timer_.call(null, initialDelay, period)
}

fun timer(initialDelay: Date, period: Int): Observable<Int> {
  return timer_.call(null, initialDelay, period)
}
