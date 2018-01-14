package kodando.rxjs.operator

import kodando.rxjs.*


@JsModule("rxjs/operators/tap")
private external object TapModule {
    val tap: JsFunction
}

fun <T> Observable<T>.tap(observer: Observer<T>): Observable<T> {
    return TapModule.tap.call(this, observer)
}

fun <T> Observable<T>.tap(
    next: NextHandler<T>? = null,
    error: ErrorHandler? = null,
    complete: CompleteHandler? = null): Observable<T> {

    return TapModule.tap.call(this, next, error, complete)
}
