@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.ObservableClass
import kodando.rxjs.Scheduler

@JsModule("rxjs/observable/empty")
private external object EmptyModule {
    val empty: JsFunction
}

fun <T> ObservableClass.empty(): Observable<T> {
    return EmptyModule.empty.call(this)
}

fun <T> ObservableClass.emptyWithScheduler(scheduler: Scheduler): Observable<T> {
    return EmptyModule.empty.call(this, scheduler)
}
