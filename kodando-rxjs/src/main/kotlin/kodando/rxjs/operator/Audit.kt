package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/audit")
private external object AuditModule {
    val audit: JsFunction
}

fun <T> Observable<T>.audit(durationSelector: (T) -> Observable<T>): Observable<T> {
    return AuditModule.audit.call(this, durationSelector)
}
