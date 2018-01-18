package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val filter_: JsFunction =
    from("rxjs/operators/filter") import "filter"

fun <T> Observable<T>.filter(predicate: (T) -> Boolean): Observable<T> {
    return pipe(filter_.call(this, predicate))
}
