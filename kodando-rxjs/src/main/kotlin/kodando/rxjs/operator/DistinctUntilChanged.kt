package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val distinctUntilChanged_: JsFunction =
    from("rxjs/operators/distinctUntilChanged") import "distinctUntilChanged"


fun <T> Observable<T>.distinctUntilChanged(): Observable<T> {
    return pipe(distinctUntilChanged_.call(this))
}

fun <T> Observable<T>.distinctUntilChanged(compare: (T, T) -> Boolean): Observable<T> {
    return pipe(distinctUntilChanged_.call(this, compare))
}

fun <T, K> Observable<T>.distinctUntilChanged(compare: (K, K) -> Boolean, keySelector: (T) -> K): Observable<T> {
    return pipe(distinctUntilChanged_.call(this, compare, keySelector))
}
