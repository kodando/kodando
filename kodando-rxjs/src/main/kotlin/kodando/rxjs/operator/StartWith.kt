package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val startWith_: JsFunction =
    from("rxjs/operators/startWith") import "startWith"


fun <T> Observable<T>.startWith(value: T): Observable<T> {
    return pipe(startWith_.call(this, value))
}
