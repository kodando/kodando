@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.ObservableClass

@JsModule("rxjs/observable/combineLatest")
private external object CombineLatestModule {
    val combineLatest: JsFunction
}

fun <T1, T2, R> ObservableClass.combineLatest(
    observable1: Observable<T1>,
    observable2: Observable<T2>,
    project: (T1, T2) -> R): Observable<R> {
    return CombineLatestModule.combineLatest.call(this, observable1, observable2, project)
}
