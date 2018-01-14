package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/concatMap")
private external object ConcatMapModule {
    val concatMap: JsFunction
}

fun <T, TResult> Observable<T>.concatMap(transformer: (T) -> Observable<TResult>): Observable<TResult> {
    return ConcatMapModule.concatMap.call(this, transformer)
}
