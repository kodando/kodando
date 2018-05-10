@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.observable

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import
import kodando.rxjs.scheduler.Scheduler

private val throwError: JsFunction =
    fromModule("rxjs") import "throwError"


fun <T> throwError(error: Throwable, scheduler: Scheduler? = null): Observable<T> {
    return throwError.call(null, error, scheduler ?: undefined)
}
