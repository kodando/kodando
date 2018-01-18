@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.*

private val throw_: JsFunction =
    from("rxjs/observable/throw") import "_throw"


fun <T> ObservableClass.throwError(error: Error): Observable<T> {
    return throw_.call(this, error)
}
