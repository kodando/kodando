package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import


private val expand_: JsFunction =
    from("rxjs/operators/expand") import "expand"


fun <T, TResult> Observable<T>.expand(
    transformer: (T) -> Observable<TResult>): Observable<TResult> {

    return pipe(expand_.call(this, transformer))
}
