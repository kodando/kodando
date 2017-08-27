@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.operators

import kodando.rxjs.*

inline fun <T1, T2, R> ObservableStatic.combineLatest(
    subscribable1: Subscribable<T1>,
    subscribable2: Subscribable<T2>,
    noinline project: (T1, T2) -> R): Observable<R> {
    return this.asDynamic().combineLatest(subscribable1, subscribable2, project)
}
