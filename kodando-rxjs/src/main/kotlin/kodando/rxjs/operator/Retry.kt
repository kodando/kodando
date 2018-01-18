package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val retry_: JsFunction =
    from("rxjs/operators/retry") import "retry"


fun <T> Observable<T>.retry(times: Int): Observable<T> {
    return pipe(retry_.call(this, times))
}
