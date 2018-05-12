package kodando.redurx

import kodando.jest.Spec
import kodando.jest.expect
import kodando.runtime.async.await
import kodando.rxjs.Observable
import kodando.rxjs.Subject
import kodando.rxjs.observable.empty
import kodando.rxjs.operators.ofType
import kodando.rxjs.operators.switchMap
import kodando.rxjs.operators.toArray

class EffectSpec : Spec() {
  init {
    describe("Effects") {
      it("can be created from any action") byCheckingAfter {
        val inputSubject = Subject<Action>()
        val effect = Effect1(inputSubject)

        val inputActionsPromise = inputSubject.toArray().toPromise()
        val effectActionsPromise = effect.countActions.toArray().toPromise()
        val outputActionsPromise = effect.toArray().toPromise()

        inputSubject.next(IncrementAction())
        inputSubject.next(DecrementAction())

        inputSubject.complete()
        effect.complete()

        val inputActions = await(inputActionsPromise)
        val effectActions = await(effectActionsPromise)
        val outputActions = await(outputActionsPromise)

        expect(effectActions.size).toBe(0)
        expect(outputActions.size).toBe(0)
        expect(inputActions.size).toBe(2)
      }

      it("can be created from specific actions") byCheckingAfter {
        val inputSubject = Subject<Action>()

        val effect = Effect2(inputSubject)
        val inputActionsPromise = inputSubject.toArray().toPromise()
        val effectActionsPromise = effect.incrementActions.toArray().toPromise()
        val outputActionsPromise = effect.toArray().toPromise()

        inputSubject.next(IncrementAction())
        inputSubject.next(DecrementAction())
        inputSubject.complete()
        effect.complete()

        val inputActions = await(inputActionsPromise)
        val effectActions = await(effectActionsPromise)
        val outputActions = await(outputActionsPromise)

        expect(effectActions.size).toBe(1)
        expect(outputActions.size).toBe(1)
        expect(inputActions.size).toBe(2)
      }

      it("can be created and produce more actions") byCheckingAfter {
        val inputSubject = Subject<Action>()

        val effect = Effect3(inputSubject)
        val inputActionsPromise = inputSubject.toArray().toPromise()
        val effectActionsPromise = effect.multipleIncrements.toArray().toPromise()
        val outputActionsPromise = effect.toArray().toPromise()

        inputSubject.next(MultipleIncrementAction(3))
        inputSubject.next(DecrementAction())

        inputSubject.complete()
        effect.complete()

        val inputActions = await(inputActionsPromise)
        val effectActions = await(effectActionsPromise)
        val outputActions = await(outputActionsPromise)

        expect(effectActions.size).toBe(3)
        expect(inputActions.size).toBe(2)
        expect(outputActions.size).toBe(3)
      }

      it("can be created and produce more actions with a reified generic type") byCheckingAfter {
        val inputSubject = Subject<Action>()

        val effect = Effect4(inputSubject)
        val inputActionsPromise = inputSubject.toArray().toPromise()
        val effectActionsPromise = effect.multipleIncrementsWithReifiedType.toArray().toPromise()
        val outputActionsPromise = effect.toArray().toPromise()

        inputSubject.next(MultipleIncrementAction(3))
        inputSubject.next(DecrementAction())
        inputSubject.complete()
        effect.complete()

        val inputActions = await(inputActionsPromise)
        val effectActions = await(effectActionsPromise)
        val outputActions = await(outputActionsPromise)

        expect(effectActions.size).toBe(3)
        expect(inputActions.size).toBe(2)
        expect(outputActions.size).toBe(3)
      }
    }
  }

  class IncrementAction : BaseAction()

  class DecrementAction : BaseAction()

  data class MultipleIncrementAction(val times: Int) : BaseAction()

  class Effect1(actionS: Observable<Action>) : Effect() {
    val countActions = processing {
      it.switchMap { empty<Action>() }
    }

    init {
      activate(actionS)
    }
  }

  class Effect2(actionS: Observable<Action>) : Effect() {
    val incrementActions = processing {
      it.ofType<IncrementAction>()
    }

    init {
      activate(actionS)
    }
  }

  class Effect3(actionS: Observable<Action>) : Effect() {
    val multipleIncrements = processingOfType(MultipleIncrementAction::class) {
      it.switchMap { action ->
        Observable<Action> { observer ->
          for (i in 0 until action.times) {
            observer.next(IncrementAction())
          }

          observer.complete()
          null
        }
      }
    }

    init {
      activate(actionS)
    }
  }

  class Effect4(actionS: Observable<Action>) : Effect() {
    val multipleIncrementsWithReifiedType = processingOfType<MultipleIncrementAction> {
      it.switchMap { action ->
        Observable<Action> { observer ->
          for (i in 0 until action.times) {
            observer.next(IncrementAction())
          }

          observer.complete()
          null
        }
      }
    }

    init {
      activate(actionS)
    }
  }

}