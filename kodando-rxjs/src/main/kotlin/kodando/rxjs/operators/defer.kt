@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.operators

import kodando.rxjs.*
import kotlin.js.Promise

inline fun <T> ObservableStatic.defer(noinline factory: () -> Subscribable<T>): Observable<T> {
    return this.asDynamic().defer(factory)
}

inline fun <T> ObservableStatic.deferWhen(noinline factory: () -> Promise<T>): Observable<T> {
    return this.asDynamic().defer(factory)
}
