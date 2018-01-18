package kodando.rxjs.operator

import kodando.rxjs.*


private val auditTime_: JsFunction =
    from("rxjs/operators/auditTime") import "auditTime"

fun <T> Observable<T>.auditTime(duration: Int): Observable<T> {
    return pipe(auditTime_.call(this, duration))
}

fun <T> Observable<T>.auditTimeWithScheduler(duration: Int, scheduler: Scheduler): Observable<T> {
    return pipe(auditTime_.call(this, duration, scheduler))
}
