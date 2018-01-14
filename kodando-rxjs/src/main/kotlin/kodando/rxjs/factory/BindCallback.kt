@file:Suppress("UnsafeCastFromDynamic", "unused")

package kodando.rxjs.factory

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.ObservableClass
import kodando.rxjs.Scheduler

@JsModule("rxjs/observable/bindCallback")
private external object BindCallbackModule {
    val bindCallback: JsFunction
}

fun <T, R> ObservableClass.bindCallback(func: (T) -> R): (T) -> Observable<R> {
    return BindCallbackModule.bindCallback.call(this, func)
}

fun <T, R> ObservableClass.bindCallbackWithScheduler(scheduler: Scheduler, func: (T) -> R): (T) -> Observable<R> {
    return BindCallbackModule.bindCallback.call(this, func, null, scheduler)
}

fun <T1, T2, R> ObservableClass.bindCallback(func: (T1) -> T2, selector: (T2) -> R): (T1) -> Observable<R> {
    return BindCallbackModule.bindCallback.call(this, func, selector)
}

fun <T1, T2, R> ObservableClass.bindCallbackWithScheduler(scheduler: Scheduler, func: (T1) -> T2, selector: (T2) -> R): (T1) -> Observable<R> {
    return BindCallbackModule.bindCallback.call(this, func, selector, scheduler)
}
