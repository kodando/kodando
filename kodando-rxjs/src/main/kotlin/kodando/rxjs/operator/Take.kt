package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val take_: JsFunction =
    from("rxjs/operators/take") import "take"


fun <T> Observable<T>.take(count: Int): Observable<T> {
    return pipe(take_.call(this, count))
}
