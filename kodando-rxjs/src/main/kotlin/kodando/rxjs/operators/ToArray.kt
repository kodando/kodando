package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val toArray_: JsFunction =
    fromModule("rxjs/operators") import ("toArray")


fun <T> Observable<T>.toArray(): Observable<Array<T>> {
    return pipe(toArray_.call(null))
}
