package kodando.rxjs.factory

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.ObservableClass
import kotlin.js.Promise

@JsModule("rxjs/observable/from")
private external object FromModule {
    val from: JsFunction
}

fun <T> ObservableClass.from(promise: Promise<T>): Observable<T> {
    return FromModule.from.call(this, promise)
}

fun <T> ObservableClass.from(array: Array<T>): Observable<T> {
    return FromModule.from.call(this, array)
}

fun <T> ObservableClass.from(observable: Observable<T>): Observable<T> {
    return FromModule.from.call(this, observable)
}
