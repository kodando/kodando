@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.ObservableClass

@JsModule("rxjs/observable/range")
private external object RangeModule {
    val range: JsFunction
}

fun ObservableClass.range(start: Int, count: Int): Observable<Int> {
    return RangeModule.range.call(this, start, count)
}
