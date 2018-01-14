package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/startWith")
private external object StartWithModule {
    val startWith: JsFunction
}

fun <T> Observable<T>.startWith(value: T): Observable<T> {
    return StartWithModule.startWith.call(this, value)
}
