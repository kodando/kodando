package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/delayWhen")
private external object DelayWhenModule {
    val delayWhen: JsFunction
}

fun <T> Observable<T>.delayWhen(
    delayDurationSelector: (value: T) -> Observable<*>,
    subscriptionDelay: Observable<*>? = null): Observable<T> {

    return DelayWhenModule.delayWhen.call(this, delayDurationSelector, subscriptionDelay)
}
