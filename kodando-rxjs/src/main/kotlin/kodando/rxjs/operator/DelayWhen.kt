package kodando.rxjs.operator

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.from
import kodando.rxjs.import

private val delayWhen_: JsFunction =
    from("rxjs/operators/delayWhen") import "delayWhen"


fun <T> Observable<T>.delayWhen(
    delayDurationSelector: (value: T) -> Observable<*>,
    subscriptionDelay: Observable<*>? = null): Observable<T> {

    return pipe(delayWhen_.call(this, delayDurationSelector, subscriptionDelay))
}
