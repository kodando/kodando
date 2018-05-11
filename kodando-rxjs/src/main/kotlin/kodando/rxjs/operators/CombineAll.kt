package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val combineAll_: JsFunction =
  fromModule("rxjs/operators") import "combineAll"

fun <T> Observable<out Observable<T>>.combineAll(): Observable<Array<T>> {
  return pipe(combineAll_.call(this))
}
