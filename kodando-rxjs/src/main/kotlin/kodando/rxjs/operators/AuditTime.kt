package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import
import kodando.rxjs.scheduler.Scheduler


private val auditTime_: JsFunction =
    fromModule("rxjs/operators") import "auditTime"

fun <T> Observable<T>.auditTime(duration: Int): Observable<T> {
    return pipe(auditTime_.call(this, duration))
}

fun <T> Observable<T>.auditTimeWithScheduler(duration: Int, scheduler: Scheduler): Observable<T> {
    return pipe(auditTime_.call(this, duration, scheduler))
}
