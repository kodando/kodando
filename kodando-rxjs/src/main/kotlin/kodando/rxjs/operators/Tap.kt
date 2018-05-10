package kodando.rxjs.operators

import kodando.rxjs.*


private val tap_: JsFunction =
    fromModule("rxjs/operators") import "tap"


fun <T> Observable<T>.tap(observer: Observer<T>): Observable<T> {
    return pipe(tap_.call(this, observer))
}

fun <T> Observable<T>.tap(observer: ObserverLike<T>): Observable<T> {
    return pipe(tap_.call(this, observer))
}

fun <T> Observable<T>.tap(
    next: NextHandler<T>? = null,
    error: ErrorHandler? = null,
    complete: CompleteHandler? = null): Observable<T> {

    return pipe(tap_.call(this, next, error, complete))
}
