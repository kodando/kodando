package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/mergeMap")
private external object MergeMapModule {
    val mergeMap: JsFunction
}

fun <T, TResult> Observable<T>.mergeMap(transformer: (T) -> Observable<TResult>): Observable<TResult> {
    return MergeMapModule.mergeMap.call(this, transformer)
}
