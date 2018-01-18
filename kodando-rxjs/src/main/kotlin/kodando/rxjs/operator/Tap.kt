package kodando.rxjs.operator

import kodando.rxjs.*


private val tap_: JsFunction =
    from("rxjs/operators/tap") import "tap"


fun <T> Observable<T>.tap(observer: Observer<T>): Observable<T> {
    return pipe(tap_.call(this, observer))
}

fun <T> Observable<T>.tap(
    next: NextHandler<T>? = null,
    error: ErrorHandler? = null,
    complete: CompleteHandler? = null): Observable<T> {

    return pipe(tap_.call(this, next, error, complete))
}
