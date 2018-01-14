package kodando.rxjs.factory

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.ObservableClass

@JsModule("rxjs/observable/of")
private external object OfModule {
    val of: JsFunction
}

fun <T> ObservableClass.of(vararg values: T): Observable<T> {
    return OfModule.of.apply(this, values)
}
