package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/combineAll")
private external object CombineAllModule {
    val combineAll: JsFunction
}

fun <T> Observable<out Observable<T>>.combineAll(): Observable<Array<T>> {
    return CombineAllModule.combineAll.call(this)
}
