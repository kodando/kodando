@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.operators

import kodando.rxjs.Observable
import kodando.rxjs.ObservableStatic

inline fun <T> ObservableStatic.throwError(error: Error): Observable<T> =
    this.asDynamic().`throw`(error)
