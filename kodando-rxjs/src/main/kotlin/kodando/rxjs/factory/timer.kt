@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.*
import kotlin.js.Date

private val timer_: JsFunction =
    from("rxjs/observable/timer") import "timer"


fun ObservableClass.timer(initialDelay: Int, period: Int): Observable<Int> {
    return timer_.call(this, initialDelay, period)
}

fun ObservableClass.timer(initialDelay: Date, period: Int): Observable<Int> {
    return timer_.call(this, initialDelay, period)
}
