@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.*

private val concat_: JsFunction =
    from("rxjs/observable/concat") import "concat"


fun <T> ObservableClass.concat(vararg observables: Observable<T>): Observable<T> {
    return concat_.apply(this, observables)
}

fun <T> ObservableClass.concat(vararg observables: Observable<T>, scheduler: Scheduler): Observable<T> {
    return concat_.apply(this, observables + scheduler)
}
