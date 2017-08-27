@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.operators

import kodando.rxjs.*

inline fun <T> ObservableStatic.concat(vararg subscribables: Subscribable<T>): Observable<T> {
    return this.asDynamic().concat.apply(this, subscribables)
}

inline fun <T> ObservableStatic.concat(vararg subscribables: Subscribable<T>, scheduler: Scheduler): Observable<T> {
    return this.asDynamic().concat.apply(this, subscribables + scheduler)
}
