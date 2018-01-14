package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/toArray")
private external object ToArrayModule {
    val toArray: JsFunction
}

fun <T> Observable<T>.toArray(): Observable<Array<T>> {
    return ToArrayModule.toArray.call(this)
}
