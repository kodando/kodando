package kodando.redurx

import kodando.rxjs.BehaviorSubject
import kodando.rxjs.Unsubscribable
import kodando.rxjs.scan
import kodando.rxjs.subscribe

class Store<T> private constructor(initialState: T,
                                   reducer: Reducer<T>,
                                   middlewares: Array<out Middleware<T>>) : BehaviorSubject<T>(initialState) {

    private var subscription: Unsubscribable? = null

    init {
        val combinedReducer =
            middlewares
                .reversedArray()
                .fold(reducer) { reducer, middleware -> middleware(this, reducer) }

        subscription = Actions
            .scan(combinedReducer, initialState)
            .subscribe(this)
    }

    fun dispose() {
        subscription?.unsubscribe()
        subscription = null
    }

    fun dispatch(action: Action) {
        Actions.dispatch(action)
    }

    companion object {

        fun <T> create(initialState: T,
                       reducer: Reducer<T>,
                       vararg middlewares: Middleware<T>): Store<T> {

            return Store(initialState, reducer, middlewares)
        }

    }

}
