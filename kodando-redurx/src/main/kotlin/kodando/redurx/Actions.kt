package kodando.redurx

import kodando.rxjs.Subject

object Actions : Subject<Action>() {
    fun dispatch(action: Action) {
        next(action)
    }
}
