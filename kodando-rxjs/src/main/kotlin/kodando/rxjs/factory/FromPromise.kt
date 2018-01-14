package kodando.rxjs.factory

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.ObservableClass
import kotlin.js.Promise

@JsModule("rxjs/observable/fromPromise")
private external object FromPromiseModule {
    val fromPromise: JsFunction
}

fun <T> ObservableClass.fromPromise(promise: Promise<T>): Observable<T> {
    return FromPromiseModule.fromPromise.call(this, promise)
}
