package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val concatAll_: JsFunction =
    fromModule("rxjs/operators") import "concatAll"


fun <T> Observable<Observable<T>>.concatAll(): Observable<Array<T>> {
    return pipe(concatAll_.call(this))
}
