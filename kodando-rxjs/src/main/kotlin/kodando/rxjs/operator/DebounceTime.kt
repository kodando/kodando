package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/debounceTime")
private external object DebounceTimeModule {
    val debounceTime: JsFunction
}

fun <T> Observable<T>.debounceTime(timeInMilliseconds: Int): Observable<T> {
    return DebounceTimeModule.debounceTime.call(this, timeInMilliseconds)
}
