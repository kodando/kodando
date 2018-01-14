package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/switchMap")
private external object SwitchMapModule {
    val switchMap: JsFunction
}

fun <T, TResult> Observable<T>.switchMap(transformer: (T) -> Observable<TResult>): Observable<TResult> {
    return SwitchMapModule.switchMap.call(this, transformer)
}
