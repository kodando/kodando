@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.operators

import kodando.rxjs.*

inline fun <T> ObservableStatic.merge(vararg observables: Subscribable<T>): Observable<T> {
    return this.asDynamic().merge.apply(this, observables)
}

inline fun <T> ObservableStatic.merge(vararg observables: Subscribable<T>,
                                      concurrent: Int): Observable<T> {
    return this.asDynamic().merge.apply(this, arrayOf(*observables, concurrent))
}

inline fun <T> ObservableStatic.merge(vararg observables: Subscribable<T>,
                                      scheduler: Scheduler): Observable<T> {
    return this.asDynamic().merge.apply(this, arrayOf(*observables, scheduler))
}

inline fun <T> ObservableStatic.merge(vararg observables: Subscribable<T>,
                                      concurrent: Int,
                                      scheduler: Scheduler): Observable<T> {
    return this.asDynamic().merge.apply(this, arrayOf(*observables, concurrent, scheduler))
}