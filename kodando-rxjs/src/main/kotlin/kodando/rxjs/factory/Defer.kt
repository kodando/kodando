@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.ObservableClass
import kotlin.js.Promise

@JsModule("rxjs/observable/defer")
private external object DeferModule {
    val defer: JsFunction
}

fun <T> ObservableClass.defer(factory: () -> Observable<T>): Observable<T> {
    return DeferModule.defer.call(this, factory)
}

fun <T> ObservableClass.deferWhen(factory: () -> Promise<T>): Observable<T> {
    return DeferModule.defer.call(this, factory)
}
