package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/mergeAll")
private external object MergeAllModule {
    val mergeAll: JsFunction
}

fun <T> Observable<Observable<T>>.mergeAll(): Observable<T> {
    return MergeAllModule.mergeAll.call(this)
}
