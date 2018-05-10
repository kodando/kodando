package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import


private val bufferCount_: JsFunction =
    fromModule("rxjs/operators") import "bufferCount"

fun <T> Observable<T>.bufferCount(bufferSize: Int, startBufferEvery: Int? = null): Observable<Array<T>> {
    return pipe(bufferCount_.call(this, bufferSize, startBufferEvery))
}
