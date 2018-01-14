package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.OperatorFunction
import kodando.rxjs.Scheduler


@JsModule("rxjs/operators/bufferTime")
private external object BufferTimeModule {
    val bufferTime: JsFunction
}

fun <T> Observable<T>.bufferTime(bufferSize: Int, scheduler: Scheduler? = null): OperatorFunction<T, Array<T>> {
    return BufferTimeModule.bufferTime.call(this, bufferSize, scheduler)
}

fun <T> Observable<T>.bufferTime(bufferSize: Int, bufferCreationInterval: Int, scheduler: Scheduler? = null): OperatorFunction<T, Array<T>> {
    return BufferTimeModule.bufferTime.call(this, bufferSize, bufferCreationInterval, scheduler)
}

fun <T> Observable<T>.bufferTime(bufferSize: Int, bufferCreationInterval: Int, maxBufferSize: Int, scheduler: Scheduler? = null): OperatorFunction<T, Array<T>> {
    return BufferTimeModule.bufferTime.call(this, bufferSize, bufferCreationInterval, maxBufferSize, scheduler)
}
