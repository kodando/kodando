package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/delay")
private external object DelayModule {
    val delay: JsFunction
}

fun <T> Observable<T>.delay(time: Int): Observable<T> {
    return DelayModule.delay.call(this, time)
}
