@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.ObservableClass
import kodando.rxjs.Scheduler

@JsModule("rxjs/observable/interval")
private external object IntervalModule {
    val interval: JsFunction
}

fun ObservableClass.interval(period: Int, scheduler: Scheduler? = null): Observable<Int> {
    return IntervalModule.interval.call(this, period, scheduler ?: undefined)
}
