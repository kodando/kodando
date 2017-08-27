@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.operators

import kodando.rxjs.*

inline fun <T> ObservableStatic.empty(): Observable<T> {
    return this.asDynamic().empty()
}

inline fun <T> ObservableStatic.emptyWithScheduler(scheduler: Scheduler): Observable<T> {
    return this.asDynamic().empty(scheduler)
}
