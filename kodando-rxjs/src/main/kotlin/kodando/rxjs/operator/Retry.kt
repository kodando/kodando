package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/retry")
private external object RetryModule {
    val retry: JsFunction
}

@JsName("retry")
fun <T> Observable<T>.retry(times: Int): Observable<T> {
    return RetryModule.retry.call(this, times)
}
