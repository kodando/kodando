package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val combineAll_: JsFunction =
    from("rxjs/operators/combineAll") import "combineAll"

fun <T> Observable<out Observable<T>>.combineAll(): Observable<Array<T>> {
    return pipe(combineAll_.call(this))
}
