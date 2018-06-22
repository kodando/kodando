package kodando.store

import kodando.rxjs.Observable
import kodando.rxjs.Subject

object GlobalActionDispatcher : ActionDispatcher {
  private val actionS = Subject<Action>()

  override fun dispatch(action: Action) {
    actionS.next(action)
  }

  override fun asObservable(): Observable<Action> {
    return actionS
  }
}
