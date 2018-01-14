package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/throttleTime")
private external object ThrottleTimeModule {
    val throttleTime: JsFunction
}

fun <T> Observable<T>.throttleTime(timeInMilliseconds: Int): Observable<T> {
    return ThrottleTimeModule.throttleTime.call(this, timeInMilliseconds)
}
