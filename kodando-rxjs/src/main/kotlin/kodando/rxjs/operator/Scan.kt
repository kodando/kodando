package kodando.rxjs.operator

import kodando.rxjs.Accumulator
import kodando.rxjs.AccumulatorWithIndex
import kodando.rxjs.JsFunction
import kodando.rxjs.Observable

@JsModule("rxjs/operators/scan")
private external object ScanModule {
    val scan: JsFunction
}

fun <T, R> Observable<T>.scan(seed: R? = undefined, accumulator: Accumulator<T, R>): Observable<R> {
    return if (seed === undefined) {
        ScanModule.scan.call(this, accumulator)
    } else {
        ScanModule.scan.call(this, accumulator, seed)
    }
}

fun <T, R> Observable<T>.scanIndexed(seed: R? = undefined, accumulator: AccumulatorWithIndex<T, R>): Observable<R> {
    return if (seed === undefined) {
        ScanModule.scan.call(this, accumulator)
    } else {
        ScanModule.scan.call(this, accumulator, seed)
    }
}
