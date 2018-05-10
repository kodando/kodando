package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import


private val buffer_: JsFunction =
    fromModule("rxjs/operators") import "buffer"

fun <T> Observable<T>.buffer(notifier: Observable<*>): Observable<Array<T>> {
    return pipe(buffer_.call(this, notifier))
}
