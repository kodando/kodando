package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/concat")
private external object ConcatModule {
    val concat: JsFunction
}

fun <T> Observable<T>.concat(vararg others: Observable<T>): Observable<T> {
    return ConcatModule.concat.apply(this, others)
}
