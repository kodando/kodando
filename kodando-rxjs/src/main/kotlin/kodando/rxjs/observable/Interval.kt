@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.observable

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import
import kodando.rxjs.scheduler.Scheduler

private val interval_: JsFunction =
  fromModule("rxjs") import "interval"


fun interval(period: Int, scheduler: Scheduler? = null): Observable<Int> {
  return interval_.call(null, period, scheduler ?: undefined)
}
