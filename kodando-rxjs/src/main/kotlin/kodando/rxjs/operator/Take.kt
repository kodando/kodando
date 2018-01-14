package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/take")
private external object TakeModule {
    val take: JsFunction
}

fun <T> Observable<T>.take(count: Int): Observable<T> {
    return TakeModule.take.call(this, count)
}
