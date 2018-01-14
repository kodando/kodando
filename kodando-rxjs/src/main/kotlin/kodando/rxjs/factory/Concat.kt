@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.ObservableClass
import kodando.rxjs.Scheduler

@JsModule("rxjs/observable/concat")
private external object ConcatModule {
    val concat: JsFunction
}

fun <T> ObservableClass.concat(vararg observables: Observable<T>): Observable<T> {
    return ConcatModule.concat.apply(this, observables)
}

fun <T> ObservableClass.concat(vararg observables: Observable<T>, scheduler: Scheduler): Observable<T> {
    return ConcatModule.concat.apply(this, observables + scheduler)
}
