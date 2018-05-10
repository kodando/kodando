@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.observable

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import
import kotlin.js.Promise

private val defer_: JsFunction =
    fromModule("rxjs") import "defer"


fun <T> defer(factory: () -> Observable<T>): Observable<T> {
    return defer_.call(null, factory)
}

fun <T> deferWhen(factory: () -> Promise<T>): Observable<T> {
    return defer_.call(null, factory)
}
