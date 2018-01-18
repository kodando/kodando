package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val audit_: JsFunction =
    from("rxjs/operators/audit") import "audit"

fun <T> Observable<T>.audit(durationSelector: (T) -> Observable<T>): Observable<T> {
    return pipe(audit_.call(this, durationSelector))
}
