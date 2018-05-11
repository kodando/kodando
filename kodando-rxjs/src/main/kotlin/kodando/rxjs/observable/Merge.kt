@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.observable

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import
import kodando.rxjs.scheduler.Scheduler

private val merge_: JsFunction =
  fromModule("rxjs") import "merge"


fun <T> merge(vararg observables: Observable<T>): Observable<T> {
  return merge_.apply(null, observables)
}

fun <T> merge(vararg observables: Observable<T>,
              concurrent: Int): Observable<T> {
  return merge_.apply(null, arrayOf(*observables, concurrent))
}

fun <T> merge(vararg observables: Observable<T>,
              scheduler: Scheduler): Observable<T> {
  return merge_.apply(null, arrayOf(*observables, scheduler))
}

fun <T> merge(vararg observables: Observable<T>,
              concurrent: Int,
              scheduler: Scheduler): Observable<T> {
  return merge_.apply(null, arrayOf(*observables, concurrent, scheduler))
}
