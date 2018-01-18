@file:Suppress("UnsafeCastFromDynamic", "unused")

package kodando.rxjs.factory

import kodando.rxjs.*

private val bindCallback_: JsFunction =
    from("rxjs/observable/bindCallback") import "bindCallback"


fun <T, R> ObservableClass.bindCallback(func: (T) -> R): (T) -> Observable<R> {
    return bindCallback_.call(this, func)
}

fun <T, R> ObservableClass.bindCallbackWithScheduler(scheduler: Scheduler, func: (T) -> R): (T) -> Observable<R> {
    return bindCallback_.call(this, func, null, scheduler)
}

fun <T1, T2, R> ObservableClass.bindCallback(func: (T1) -> T2, selector: (T2) -> R): (T1) -> Observable<R> {
    return bindCallback_.call(this, func, selector)
}

fun <T1, T2, R> ObservableClass.bindCallbackWithScheduler(scheduler: Scheduler, func: (T1) -> T2, selector: (T2) -> R): (T1) -> Observable<R> {
    return bindCallback_.call(this, func, selector, scheduler)
}
