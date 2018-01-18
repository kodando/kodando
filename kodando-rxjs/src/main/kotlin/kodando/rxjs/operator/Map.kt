package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val map_: JsFunction =
    from("rxjs/operators/map") import "map"


fun <T, TResult> Observable<T>.map(transformer: (T) -> TResult): Observable<TResult> {
    return pipe(map_.call(this, transformer))
}
