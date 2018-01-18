package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val concat_: JsFunction =
    from("rxjs/operators/concat") import "concat"


fun <T> Observable<T>.concat(vararg others: Observable<T>): Observable<T> {
    return pipe(concat_.apply(this, others))
}
