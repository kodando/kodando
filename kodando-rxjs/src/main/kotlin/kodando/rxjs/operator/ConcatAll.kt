package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val concatAll_: JsFunction =
    from("rxjs/operators/concatAll") import "concatAll"


fun <T> Observable<Observable<T>>.concatAll(): Observable<Array<T>> {
    return pipe(concatAll_.call(this))
}
