package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.OperatorFunction


@JsModule("rxjs/operators/bufferCount")
private external object BufferCountModule {
    val bufferCount: JsFunction
}

fun <T> Observable<T>.bufferCount(bufferSize: Int, startBufferEvery: Int? = null): OperatorFunction<T, Array<T>> {
    return BufferCountModule.bufferCount.call(this, bufferSize, startBufferEvery)
}
