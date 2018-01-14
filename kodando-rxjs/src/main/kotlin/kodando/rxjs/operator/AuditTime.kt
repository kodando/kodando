package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.Scheduler


@JsModule("rxjs/operators/auditTime")
private external object AuditTimeModule {
    val auditTime: JsFunction
}

fun <T> Observable<T>.auditTime(duration: Int): Observable<T> {
    return AuditTimeModule.auditTime.call(this, duration)
}

fun <T> Observable<T>.auditTimeWithScheduler(duration: Int, scheduler: Scheduler): Observable<T> {
    return AuditTimeModule.auditTime.call(this, duration, scheduler)
}
