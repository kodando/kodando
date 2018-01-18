package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import


private val bufferCount_: JsFunction =
    from("rxjs/operators/bufferCount") import "bufferCount"

fun <T> Observable<T>.bufferCount(bufferSize: Int, startBufferEvery: Int? = null): Observable<Array<T>> {
    return pipe(bufferCount_.call(this, bufferSize, startBufferEvery))
}
