@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.*

private val interval_: JsFunction =
    from("rxjs/observable/interval") import "interval"


fun ObservableClass.interval(period: Int, scheduler: Scheduler? = null): Observable<Int> {
    return interval_.call(this, period, scheduler ?: undefined)
}
