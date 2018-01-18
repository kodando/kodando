package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val debounceTime_: JsFunction =
    from("rxjs/operators/debounceTime") import "debounceTime"


fun <T> Observable<T>.debounceTime(timeInMilliseconds: Int): Observable<T> {
    return pipe(debounceTime_.call(this, timeInMilliseconds))
}
