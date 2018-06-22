package kodando.store

import kodando.rxjs.Observable

interface ActionDispatcher {
  fun dispatch(action: Action)
  fun asObservable(): Observable<Action>
}

