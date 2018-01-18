package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val mergeAll_: JsFunction =
    from("rxjs/operators/mergeAll") import "mergeAll"


fun <T> Observable<Observable<T>>.mergeAll(): Observable<T> {
    return pipe(mergeAll_.call(this))
}
