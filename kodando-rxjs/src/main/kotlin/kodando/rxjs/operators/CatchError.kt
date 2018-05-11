package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val catchError_: JsFunction =
  fromModule("rxjs/operators") import "catchError"


fun <T> Observable<T>.catchError(transformer: (Any) -> Observable<T>): Observable<T> {
  return pipe(catchError_.call(this, transformer))
}
