package kodando.rxjs.operators

import kodando.rxjs.*

private val scan_: JsFunction =
  fromModule("rxjs/operators") import "scan"


fun <T, R> Observable<T>.scan(seed: R? = undefined, accumulator: Accumulator<T, R>): Observable<R> {
  return if (seed === undefined) {
    pipe(scan_.call(this, accumulator))
  } else {
    pipe(scan_.call(this, accumulator, seed))
  }
}

fun <T, R> Observable<T>.scanIndexed(seed: R? = undefined, accumulator: AccumulatorWithIndex<T, R>): Observable<R> {
  return if (seed === undefined) {
    pipe(scan_.call(this, accumulator))
  } else {
    pipe(scan_.call(this, accumulator, seed))
  }
}
