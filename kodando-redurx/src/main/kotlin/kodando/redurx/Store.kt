package kodando.redurx

import kodando.rxjs.*
import kodando.rxjs.observable.fromArray
import kodando.rxjs.operators.merge
import kodando.rxjs.operators.mergeMap
import kodando.rxjs.operators.scan

class Store<T>(
  initialState: T,
  private val reducer: Reducer<T>,
  private val actions: Observable<Action> = Actions,
  private val actionObserver: Observer<Action> = Actions,
  vararg val effects: Effect
) : BehaviorSubject<T>(initialState) {

  private val subscription: Unsubscribable

  init {
    val effectActions = fromArray(effects)
      .tapWith {
        next = {
          it.activate(actions)
        }
      }
      .mergeMap { it }

    val combinedActions = actions.merge(effectActions)

    subscription = combinedActions
      .scan(initialState) { state, action -> tryReduce(state, action) }
      .subscribe(this)
  }

  fun dispatch(action: Action) {
    actionObserver.next(action)
  }

  private fun tryReduce(state: T, action: Action): T {
    return try {
      reducer(state, action)
    } catch (e: Throwable) {
      console.error("Error while processing action", action, "error", e)
      state
    }
  }
}
