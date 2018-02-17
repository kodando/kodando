@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.*

private val throwError: JsFunction =
    from("rxjs/observable/throwError") import "throwError"


fun <T> ObservableClass.throwError(error: Throwable): Observable<T> {
    return throwError.call(this, error)
}
