package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val delay_: JsFunction =
    from("rxjs/operators/delay") import "delay"


fun <T> Observable<T>.delay(time: Int): Observable<T> {
    return pipe(delay_.call(this, time))
}
