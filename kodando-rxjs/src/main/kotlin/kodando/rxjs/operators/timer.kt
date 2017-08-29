@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.operators

import kodando.runtime.JsDate
import kodando.rxjs.Observable
import kodando.rxjs.ObservableStatic
import kotlin.js.Date

inline fun ObservableStatic.timer(initialDelay: Int, period: Int): Observable<Int> =
    this.asDynamic().timer(initialDelay, period)

inline fun ObservableStatic.timer(initialDelay: Date, period: Int): Observable<Int> =
    this.asDynamic().timer(initialDelay, period)

inline fun ObservableStatic.timer(initialDelay: JsDate, period: Int): Observable<Int> =
    this.asDynamic().timer(initialDelay, period)