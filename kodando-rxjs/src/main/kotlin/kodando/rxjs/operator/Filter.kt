package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/filter")
private external object FilterModule {
    val filter: JsFunction
}

fun <T> Observable<T>.filter(filter: (T) -> Boolean): Observable<T> {
    return FilterModule.filter.call(this, filter)
}
