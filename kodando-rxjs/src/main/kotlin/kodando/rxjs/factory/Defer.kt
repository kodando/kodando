@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import
import kotlin.js.Promise

private val defer_: JsFunction =
    from("rxjs/observable/defer") import "defer"


fun <T> defer(factory: () -> Observable<T>): Observable<T> {
    return defer_.call(null, factory)
}

fun <T> deferWhen(factory: () -> Promise<T>): Observable<T> {
    return defer_.call(null, factory)
}
