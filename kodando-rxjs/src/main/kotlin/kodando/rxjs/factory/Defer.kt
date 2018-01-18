@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.*
import kotlin.js.Promise

private val defer_: JsFunction =
    from("rxjs/observable/defer") import "defer"


fun <T> ObservableClass.defer(factory: () -> Observable<T>): Observable<T> {
    return defer_.call(this, factory)
}

fun <T> ObservableClass.deferWhen(factory: () -> Promise<T>): Observable<T> {
    return defer_.call(this, factory)
}
