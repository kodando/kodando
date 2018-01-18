@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.*

private val empty_: JsFunction =
    from("rxjs/observable/empty") import "empty"


fun <T> ObservableClass.empty(): Observable<T> {
    return empty_.call(this)
}

fun <T> ObservableClass.emptyWithScheduler(scheduler: Scheduler): Observable<T> {
    return empty_.call(this, scheduler)
}
