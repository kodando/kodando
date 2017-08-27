package kodando.rxjs

/**
 * Created by danfma on 03/04/17.
 */

typealias NextHandler<T> = (T) -> Unit
typealias ErrorHandler = (Any) -> Unit
typealias CompleteHandler = () -> Unit
typealias TeardownLogic = () -> Unit

typealias MaybeObserverOrHandler<T> = Maybe<Observer<T>, NextHandler<T>>
typealias ScheduleWork<T> = Maybe<AnonymousSubscription, NextHandler<T>>
