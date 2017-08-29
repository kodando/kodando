@file:Suppress("UnsafeCastFromDynamic", "unused")

package kodando.rxjs.operators

import kodando.rxjs.*


inline fun <T, R> ObservableStatic.bindCallback(noinline func: (T) -> R): (T) -> Observable<R> {
    return this.asDynamic().bindCallback(func)
}

inline fun <T, R> ObservableStatic.bindCallbackWithScheduler(scheduler: Scheduler, noinline func: (T) -> R): (T) -> Observable<R> {
    return this.asDynamic().bindCallback(func, null, scheduler)
}

inline fun <T1, T2, R> ObservableStatic.bindCallback(noinline func: (T1) -> T2, noinline selector: (T2) -> R): (T1) -> Observable<R> {
    return this.asDynamic().bindCallback(func, selector)
}

inline fun <T1, T2, R> ObservableStatic.bindCallbackWithScheduler(scheduler: Scheduler, noinline func: (T1) -> T2, noinline selector: (T2) -> R): (T1) -> Observable<R> {
    return this.asDynamic().bindCallback(func, selector, scheduler)
}
