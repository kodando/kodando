@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.operators

import kodando.rxjs.*

inline fun ObservableStatic.interval(period: Int, scheduler: Scheduler? = null): Observable<Int> {
    return this.asDynamic().interval(period, scheduler ?: undefined)
}
