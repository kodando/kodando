@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.ObservableClass
import kotlin.js.Date

@JsModule("rxjs/observable/timer")
private external object TimerModule {
    val timer: JsFunction
}

fun ObservableClass.timer(initialDelay: Int, period: Int): Observable<Int> {
    return TimerModule.timer.call(this, initialDelay, period)
}

fun ObservableClass.timer(initialDelay: Date, period: Int): Observable<Int> {
    return TimerModule.timer.call(this, initialDelay, period)
}
