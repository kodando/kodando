package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/concatAll")
private external object ConcatAllModule {
    val concatAll: JsFunction
}

fun <T> Observable<Observable<T>>.concatAll(): Observable<Array<T>> {
    return ConcatAllModule.concatAll.call(this)
}
