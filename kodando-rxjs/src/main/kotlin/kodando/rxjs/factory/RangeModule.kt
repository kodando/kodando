@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs.factory

import kodando.rxjs.*

private val range_: JsFunction =
    from("rxjs/observable/range") import "range"


fun ObservableClass.range(start: Int, count: Int): Observable<Int> {
    return range_.call(this, start, count)
}
