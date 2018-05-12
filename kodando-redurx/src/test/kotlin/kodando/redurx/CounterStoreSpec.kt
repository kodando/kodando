package kodando.redurx

import kodando.jest.Spec
import kodando.jest.expect
import kodando.runtime.async.await
import kodando.rxjs.Observable
import kodando.rxjs.observable.of
import kodando.rxjs.operators.switchMap
import kodando.rxjs.operators.take

class CounterStoreSpec : Spec() {
  init {
    describe("A CounterStore") {
      val store = Store(0, ::reduceCounter, effects = *arrayOf(CounterEffects()))

      it("should start with the initial state") byCheckingAfter {
        val counter = await(store.take(1).toPromise())

        expect(counter).toBe(0)
      }

      it("should be incremented when receiving the IncrementCounter action") byCheckingAfter {
        store.dispatch(IncrementCounter())

        val counter = await(store.take(1).toPromise())

        expect(counter).toBe(1)
      }

      it("should be decremented when receiving the DecrementCounter action") byCheckingAfter {
        store.dispatch(DecrementCounter())

        val counter = await(store.take(1).toPromise())

        expect(counter).toBe(0)
      }

      it("should process synchronous effects") byCheckingAfter {
        store.dispatch(TwoIncrementsCounter())

        val counter = await(store.take(1).toPromise())

        expect(counter).toBe(2)
      }

      it("should process asynchronous effects") byCheckingAfter {
        val timeout = 100

        store.dispatch(IncrementLater(timeout))

        var counter = await(store.take(1).toPromise())

        expect(counter).toBe(2)

        await(delay(timeout + 1))

        counter = await(store.take(1).toPromise())

        expect(counter).toBe(3)
      }
    }
  }

  class IncrementCounter : BaseAction()
  class DecrementCounter : BaseAction()
  class TwoIncrementsCounter : BaseAction()
  class IncrementLater(val time: Int) : BaseAction()

  fun reduceCounter(state: Int, action: Action): Int {
    return when (action) {
      is IncrementCounter -> state + 1
      is DecrementCounter -> state - 1
      else -> state
    }
  }

  class CounterEffects : Effect() {
    val twoIncrements = processingOfType<TwoIncrementsCounter> {
      it.switchMap {
        of(IncrementCounter(), IncrementCounter())
      }
    }

    val incrementLater = processingOfType<IncrementLater> {
      it.switchMap { action ->
        Observable<Action> { observer ->
          kodando.redurx.delay(action.time).then {
            observer.next(IncrementCounter())
            observer.complete()
          }

          null
        }
      }
    }
  }
}