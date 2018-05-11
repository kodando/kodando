package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val concat_: JsFunction =
  fromModule("rxjs/operators") import "concat"


fun <T> Observable<T>.concat(vararg others: Observable<T>): Observable<T> {
  return pipe(concat_.apply(this, others))
}
