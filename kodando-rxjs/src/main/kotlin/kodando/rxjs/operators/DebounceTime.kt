package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val debounceTime_: JsFunction =
    fromModule("rxjs/operators") import "debounceTime"


fun <T> Observable<T>.debounceTime(timeInMilliseconds: Int): Observable<T> {
    return pipe(debounceTime_.call(this, timeInMilliseconds))
}
