package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val throttleTime_: JsFunction =
    from("rxjs/operators/throttleTime") import "throttleTime"


fun <T> Observable<T>.throttleTime(timeInMilliseconds: Int): Observable<T> {
    return pipe(throttleTime_.call(this, timeInMilliseconds))
}
