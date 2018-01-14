package kodando.rxjs

    /**
     * Created by danfma on 03/04/17.
     */

typealias NextHandler<T> = (T) -> Unit

typealias ErrorHandler = (Any) -> Unit
typealias CompleteHandler = () -> Unit
typealias TeardownLogic = () -> Unit

typealias UnaryFunction<T, R> = (T) -> R
typealias OperatorFunction<T, R> = UnaryFunction<Observable<T>, Observable<R>>
typealias Factory<T> = () -> T
typealias MonoTypeOperatorFunction<T> = OperatorFunction<T, T>

typealias Accumulator<T, R> = (accumulated: R, next: T) -> R
typealias AccumulatorWithIndex<T, R> = (accumulated: R, next: T, index: Int) -> R
