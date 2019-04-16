package kodando.store

import kodando.jest.Spec
import kodando.jest.expect
import kodando.runtime.async.await
import kodando.rxjs.Observable
import kodando.rxjs.Subject
import kodando.rxjs.observable.empty
import kodando.rxjs.observable.fromArray
import kodando.rxjs.operators.filter
import kodando.rxjs.operators.map
import kodando.rxjs.operators.switchMap
import kodando.rxjs.operators.toArray

class EffectSpec : Spec() {
  init {
    describe("Effects") {
      it("can be created from any action") byCheckingAfter {
        val mutationS = Subject<Pair<Int, Action>>()
        val effectActionS = Subject<Action>()
        val effect = Effect1()

        effect.watch(mutationS).subscribe(effectActionS)

        val inputActionsPromise = mutationS.map { it.second }.toArray().toPromise()
        val effectActionsPromise = effect.countActions.toArray().toPromise()
        val outputActionsPromise = effectActionS.toArray().toPromise()

        mutationS.next(0 to IncrementAction())
        mutationS.next(1 to DecrementAction())

        mutationS.complete()

        val inputActions = await(inputActionsPromise)
        val effectActions = await(effectActionsPromise)
        val outputActions = await(outputActionsPromise)

        expect(effectActions.size).toBe(0)
        expect(outputActions.size).toBe(0)
        expect(inputActions.size).toBe(2)
      }

      it("can be created from specific actions") byCheckingAfter {
        val mutationS = Subject<Pair<Int, Action>>()
        val effectActionS = Subject<Action>()
        val effect = Effect2()

        effect.watch(mutationS).subscribe(effectActionS)

        val mutationActionsPromise = mutationS.map { it.second }.toArray().toPromise()
        val effectActionsPromise = effect.incrementActions.toArray().toPromise()
        val allEffectActionsPromise = effectActionS.toArray().toPromise()

        mutationS.next(0 to IncrementAction())
        mutationS.next(1 to DecrementAction())

        mutationS.complete()
        effectActionS.complete()

        val inputActions = await(mutationActionsPromise)
        val effectActions = await(effectActionsPromise)
        val outputActions = await(allEffectActionsPromise)

        expect(effectActions.size).toBe(1)
        expect(outputActions.size).toBe(1)
        expect(inputActions.size).toBe(2)
      }

      it("can be created and produce more actions") byCheckingAfter {
        val mutationS = Subject<Pair<Int, Action>>()
        val effectActionS = Subject<Action>()
        val effect = Effect3()

        effect.watch(mutationS).subscribe(effectActionS)

        val inputActionsPromise = mutationS.map { it.second }.toArray().toPromise()
        val effectActionsPromise = effect.multipleIncrements.toArray().toPromise()
        val outputActionsPromise = effectActionS.toArray().toPromise()

        mutationS.next(0 to MultipleIncrementAction(3))
        mutationS.next(3 to DecrementAction())

        mutationS.complete()
        effectActionS.complete()

        val inputActions = await(inputActionsPromise)
        val effectActions = await(effectActionsPromise)
        val outputActions = await(outputActionsPromise)

        expect(effectActions.size).toBe(3)
        expect(inputActions.size).toBe(2)
        expect(outputActions.size).toBe(3)
      }

      xit("can be created and produce more actions with a reified generic type") byCheckingAfter {
        val mutationS = Subject<Pair<Int, Action>>()
        val effectActionS = Subject<Action>()
        val effect = Effect4()

        effect.watch(mutationS).subscribe(effectActionS)

        val inputActionsPromise = mutationS.map { it.second }.toArray().toPromise()
        val effectActionsPromise = effect.multipleIncrementsWithReifiedType.toArray().toPromise()
        val outputActionsPromise = effectActionS.toArray().toPromise()

        mutationS.next(0 to MultipleIncrementAction(3))
        mutationS.next(3 to DecrementAction())
        mutationS.complete()
        effectActionS.complete()

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

  class Effect1 : Effect<Int>() {
    val countActions = processing {
      it.switchMap { empty<Action>() }
    }
  }

  class Effect2 : Effect<Int>() {
    val incrementActions = processing {
      it.filter { (_, action) -> action is IncrementAction }
        .unsafeCast<Observable<Pair<Int, IncrementAction>>>()
        .map { (_, action) -> action }
    }
  }

  class Effect3 : Effect<Int>() {
    val multipleIncrements = processingOfType(MultipleIncrementAction::class) {
      it.switchMap { (_, action) ->
        fromArray((0 until action.times).map { IncrementAction() }.toTypedArray())
      }
    }
  }

  class Effect4 : Effect<Int>() {
    val multipleIncrementsWithReifiedType = processingOfType<MultipleIncrementAction> {
      it.switchMap { (_, action) ->
        Observable<Action> { observer ->
          for (i in 0 until action.times) {
            observer.next(IncrementAction())
          }

          observer.complete()
          null
        }
      }
    }
  }

}
