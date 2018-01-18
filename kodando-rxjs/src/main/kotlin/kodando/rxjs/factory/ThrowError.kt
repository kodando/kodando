@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.ObservableClass

@JsModule("rxjs/observable/throw")
private external object ThrowErrorModule {
    @JsName("throw")
    val throwError: JsFunction
}

fun <T> ObservableClass.throwError(error: Error): Observable<T> {
    return ThrowErrorModule.throwError.call(this, error)
}
