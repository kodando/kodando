@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.*

private val combineLatest_: JsFunction =
    from("rxjs/observable/combineLatest") import "combineLatest"


fun <T1, T2, R> ObservableClass.combineLatest(
    observable1: Observable<T1>,
    observable2: Observable<T2>,
    project: (T1, T2) -> R): Observable<R> {

    return combineLatest_.call(this, observable1, observable2, project)
}
