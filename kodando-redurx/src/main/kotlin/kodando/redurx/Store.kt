package kodando.redurx

import kodando.rxjs.BehaviorSubject
import kodando.rxjs.Subject
import kodando.rxjs.Unsubscribable
import kodando.rxjs.observable.fromArray
import kodando.rxjs.operators.map
import kodando.rxjs.operators.merge
import kodando.rxjs.operators.mergeMap
import kodando.rxjs.operators.scan
import kodando.rxjs.subscribeNext

class Store<T>(
  initialState: T,
  reducer: Reducer<T>,
  effects: Array<out Effect<T>>,
  private val actionDispatcher: ActionDispatcher
) : BehaviorSubject<T>(initialState) {

  private val subscription: Unsubscribable

  init {
    val enhancedReducer: Reducer<T> = enhanceReducer(reducer)
    val mutationS = Subject<Pair<T, Action>>()

    val reactionS = fromArray(effects)
      .mergeMap { it.watch(mutationS) }

    val actionAndReactionS = actionDispatcher.asObservable().merge(reactionS)

    subscription = actionAndReactionS
      .map { value to it }
      .scan((initialState to Init) as Pair<T, Action>) { (prevState, _), (_, nextAction) ->
        val nextState = enhancedReducer(prevState, nextAction)

        nextState to nextAction
      }
      .subscribeNext { mutation ->
        this.next(mutation.first)
        mutationS.next(mutation)
      }
  }

  constructor(initialState: T, reducer: Reducer<T>, vararg effects: Effect<T>)
    : this(initialState, reducer, effects, GlobalActionDispatcher)

  fun dispatch(action: Action) {
    actionDispatcher.dispatch(action)
  }

  private fun enhanceReducer(reducer: Reducer<T>): Reducer<T> = { state, action ->
    try {
      reducer(state, action)
    } catch (e: Throwable) {
      console.error("Error while processing action", action, "error", e)
      state
    }
  }
}

