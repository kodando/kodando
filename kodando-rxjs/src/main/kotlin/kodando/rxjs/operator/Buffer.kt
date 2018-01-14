package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.OperatorFunction


@JsModule("rxjs/operators/buffer")
private external object BufferModule {
    val buffer: JsFunction
}

fun <T> Observable<T>.buffer(notifier: Observable<*>): OperatorFunction<T, Array<T>> {
    return BufferModule.buffer.call(this, notifier)
}
