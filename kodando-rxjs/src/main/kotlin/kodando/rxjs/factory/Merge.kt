@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.*

private val merge_: JsFunction =
    from("rxjs/observable/merge") import "merge"


fun <T> ObservableClass.merge(vararg observables: Observable<T>): Observable<T> {
    return merge_.apply(this, observables)
}

fun <T> ObservableClass.merge(vararg observables: Observable<T>,
                              concurrent: Int): Observable<T> {
    return merge_.apply(this, arrayOf(*observables, concurrent))
}

fun <T> ObservableClass.merge(vararg observables: Observable<T>,
                              scheduler: Scheduler): Observable<T> {
    return merge_.apply(this, arrayOf(*observables, scheduler))
}

fun <T> ObservableClass.merge(vararg observables: Observable<T>,
                              concurrent: Int,
                              scheduler: Scheduler): Observable<T> {
    return merge_.apply(this, arrayOf(*observables, concurrent, scheduler))
}
