package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/distinctUntilChanged")
private external object DistinctUntilChangedModule {
    val distinctUntilChanged: JsFunction
}

fun <T> Observable<T>.distinctUntilChanged(): Observable<T> {
    return DistinctUntilChangedModule.distinctUntilChanged.call(this)
}

fun <T> Observable<T>.distinctUntilChanged(compare: (T, T) -> Boolean): Observable<T> {
    return DistinctUntilChangedModule.distinctUntilChanged.call(this, compare)
}

fun <T, K> Observable<T>.distinctUntilChanged(compare: (K, K) -> Boolean, keySelector: (T) -> K): Observable<T> {
    return DistinctUntilChangedModule.distinctUntilChanged.call(this, compare, keySelector)
}
