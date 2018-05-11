@file:Suppress("UnsafeCastFromDynamic", "unused")

package kodando.rxjs.observable

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import
import kodando.rxjs.scheduler.Scheduler

private val bindCallback_: JsFunction =
  fromModule("rxjs") import "bindCallback"


fun <T, R> bindCallback(func: (T) -> R): (T) -> Observable<R> {
  return bindCallback_.call(null, func)
}

fun <T, R> bindCallbackWithScheduler(scheduler: Scheduler, func: (T) -> R): (T) -> Observable<R> {
  return bindCallback_.call(null, func, null, scheduler)
}

fun <T1, T2, R> bindCallback(func: (T1) -> T2, selector: (T2) -> R): (T1) -> Observable<R> {
  return bindCallback_.call(null, func, selector)
}

fun <T1, T2, R> bindCallbackWithScheduler(scheduler: Scheduler, func: (T1) -> T2, selector: (T2) -> R): (T1) -> Observable<R> {
  return bindCallback_.call(null, func, selector, scheduler)
}
