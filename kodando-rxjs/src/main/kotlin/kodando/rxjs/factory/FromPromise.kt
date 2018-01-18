package kodando.rxjs.factory

import kodando.rxjs.*
import kotlin.js.Promise

private val fromPromise_: JsFunction =
    from("rxjs/observable/fromPromise") import "fromPromise"


fun <T> ObservableClass.fromPromise(promise: Promise<T>): Observable<T> {
    return fromPromise_.call(this, promise)
}
