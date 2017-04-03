package kodando.rxjs

/**
 * Created by danfma on 03/04/17.
 */

typealias NextHandler<T> = (T) -> Unit
typealias ErrorHandler = (Any) -> Unit
typealias CompleteHandler = () -> Unit

