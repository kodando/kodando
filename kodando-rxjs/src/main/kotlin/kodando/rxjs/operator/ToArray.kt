package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val toArray_: JsFunction =
    from("rxjs/operators/toArray") import ("toArray")


fun <T> Observable<T>.toArray(): Observable<Array<T>> {
    return this.pipe(toArray_.call(this))
}
