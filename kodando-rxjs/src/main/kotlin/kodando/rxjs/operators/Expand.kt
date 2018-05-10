package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import


private val expand_: JsFunction =
    fromModule("rxjs/operators") import "expand"


fun <T, TResult> Observable<T>.expand(
    transformer: (T) -> Observable<TResult>): Observable<TResult> {

    return pipe(expand_.call(this, transformer))
}
