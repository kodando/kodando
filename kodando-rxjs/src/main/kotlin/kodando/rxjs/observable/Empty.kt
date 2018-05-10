@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.observable

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import
import kodando.rxjs.scheduler.Scheduler

private val empty_: JsFunction =
    fromModule("rxjs") import "empty"


fun <T> empty(): Observable<T> {
    return empty_.call(null)
}

fun <T> emptyScheduled(scheduler: Scheduler): Observable<T> {
    return empty_.call(null, scheduler)
}
