package kodando.rxjs

/**
 * Created by danfma on 03/04/17.
 */

typealias NextHandler<T> = (T) -> Unit

typealias ErrorHandler = (Throwable) -> Unit
typealias CompleteHandler = () -> Unit
typealias TeardownLogic = () -> Unit

typealias UnaryFunction<T, R> = (T) -> R
typealias OperatorFunction<T, R> = UnaryFunction<Observable<T>, Observable<R>>

typealias Accumulator<T, R> = (accumulated: R, next: T) -> R
typealias AccumulatorWithIndex<T, R> = (accumulated: R, next: T, index: Int) -> R
