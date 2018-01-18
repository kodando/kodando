package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import


private val buffer_: JsFunction =
    from("rxjs/operators/buffer") import "buffer"

fun <T> Observable<T>.buffer(notifier: Observable<*>): Observable<Array<T>> {
    return pipe(buffer_.call(this, notifier))
}
