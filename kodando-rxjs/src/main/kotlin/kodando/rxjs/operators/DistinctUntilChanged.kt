package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val distinctUntilChanged_: JsFunction =
  fromModule("rxjs/operators") import "distinctUntilChanged"


fun <T> Observable<T>.distinctUntilChanged(): Observable<T> {
  return pipe(distinctUntilChanged_.call(this))
}

fun <T> Observable<T>.distinctUntilChanged(compare: (T, T) -> Boolean): Observable<T> {
  return pipe(distinctUntilChanged_.call(this, compare))
}

fun <T, K> Observable<T>.distinctUntilChanged(compare: (K, K) -> Boolean, keySelector: (T) -> K): Observable<T> {
  return pipe(distinctUntilChanged_.call(this, compare, keySelector))
}
