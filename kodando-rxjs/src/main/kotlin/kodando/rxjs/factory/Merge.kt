@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.ObservableClass
import kodando.rxjs.Scheduler

@JsModule("rxjs/observable/merge")
private external object MergeModule {
    val merge: JsFunction
}

fun <T> ObservableClass.merge(vararg observables: Observable<T>): Observable<T> {
    return MergeModule.merge.apply(this, observables)
}

fun <T> ObservableClass.merge(vararg observables: Observable<T>,
                              concurrent: Int): Observable<T> {
    return MergeModule.merge.apply(this, arrayOf(*observables, concurrent))
}

fun <T> ObservableClass.merge(vararg observables: Observable<T>,
                              scheduler: Scheduler): Observable<T> {
    return MergeModule.merge.apply(this, arrayOf(*observables, scheduler))
}

fun <T> ObservableClass.merge(vararg observables: Observable<T>,
                              concurrent: Int,
                              scheduler: Scheduler): Observable<T> {
    return MergeModule.merge.apply(this, arrayOf(*observables, concurrent, scheduler))
}
