package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val mergeAll_: JsFunction =
    fromModule("rxjs/operators") import "mergeAll"


fun <T> Observable<Observable<T>>.mergeAll(): Observable<T> {
    return pipe(mergeAll_.call(this))
}
