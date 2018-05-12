package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val merge_: JsFunction =
  fromModule("rxjs/operators") import "merge"


fun <T> Observable<T>.merge(vararg otherS: Observable<T>): Observable<T> {
  return pipe(merge_.apply(null, otherS))
}
