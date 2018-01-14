package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/map")
private external object MapModule {
    val map: JsFunction
}

fun <T, TResult> Observable<T>.map(transformer: (T) -> TResult): Observable<TResult> {
    return MapModule.map.call(this, transformer)
}
