@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.observable

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import
import kodando.rxjs.scheduler.Scheduler

private val range_: JsFunction =
  fromModule("rxjs") import "range"


fun range(start: Int, count: Int, scheduler: Scheduler? = null): Observable<Int> {
  return range_.call(null, start, count, scheduler ?: undefined)
}
