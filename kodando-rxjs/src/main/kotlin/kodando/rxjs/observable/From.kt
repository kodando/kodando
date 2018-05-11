package kodando.rxjs.observable

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import
import kotlin.js.Promise

private val from_: JsFunction =
  fromModule("rxjs") import "from"


fun <T> from(observable: Observable<T>): Observable<T> {
  return from_.call(null, observable)
}

fun <T> fromPromise(promise: Promise<T>): Observable<T> {
  return from_.call(null, promise)
}

fun <T> fromArray(input: Array<T>): Observable<T> {
  return from_.call(null, input)
}
