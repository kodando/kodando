@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.operators

import kodando.rxjs.Observable
import kodando.rxjs.ObservableStatic

@JsName("range")
inline fun ObservableStatic.range(start: Int, count: Int): Observable<Int> =
    this.asDynamic().range(start, count)

