package kodando.redurx

import kotlin.js.Json
import kotlin.js.json

class RootStore(private var currentState: Json = json(),
                private val reducer: Reducer<Json>,
                vararg middlewares: Middleware<Json>) {

    private val apply = { state: Json, next: Reducer<Json> ->
        { action: Action ->
            next(state, action)
        }
    }

    init {
        val apply = { state: Json, next: Reducer<Json> ->
            { action: Action ->
                next(state, action)
            }
        }
    }

    fun dispatch(action: Action) {
        currentState = apply(currentState, reducer)(action)
    }

}
