package kodando.rxjs.factory

import kodando.rxjs.*
import kotlin.js.Promise

private val from_: JsFunction =
    from("rxjs/observable/from") import "from"


fun <T> ObservableClass.from(promise: Promise<T>): Observable<T> {
    return from_.call(this, promise)
}

fun <T> ObservableClass.from(array: Array<T>): Observable<T> {
    return from_.call(this, array)
}

fun <T> ObservableClass.from(observable: Observable<T>): Observable<T> {
    return from_.call(this, observable)
}
