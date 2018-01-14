package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable


@JsModule("rxjs/operators/expand")
private external object ExpandModule {
    val flatMap: JsFunction
}

fun <T, TResult> Observable<T>.expand(
    transformer: (T) -> Observable<TResult>): Observable<TResult> {
    return ExpandModule.flatMap.call(this, transformer)
}
