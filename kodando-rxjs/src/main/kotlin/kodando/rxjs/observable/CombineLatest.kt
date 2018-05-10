@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.observable

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val combineLatest_: JsFunction =
    fromModule("rxjs") import "combineLatest"


fun <T1, T2, R> combineLatest(
    observable1: Observable<T1>,
    observable2: Observable<T2>,
    project: (T1, T2) -> R): Observable<R> {

    return combineLatest_.call(null, observable1, observable2, project)
}
