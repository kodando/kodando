package kodando.store

import kodando.rxjs.Observable
import kodando.rxjs.Subject
import kodando.rxjs.observable.fromArray
import kodando.rxjs.operators.filter
import kodando.rxjs.operators.mergeMap
import kodando.rxjs.operators.tap
import kotlin.reflect.KClass

typealias EffectProcessor<TState> = (Observable<Pair<TState, Action>>) -> Observable<Action>
typealias EffectProcessorOfAction<TState, TAction> = (Observable<Pair<TState, TAction>>) -> Observable<Action>

abstract class Effect<TState> {

  private var processors = arrayOf<EffectProcessor<TState>>()

  fun watch(mutationS: Observable<Pair<TState, Action>>): Observable<Action> {
    return fromArray(processors).mergeMap { it(mutationS) }
  }

  protected fun processing(
    processor: EffectProcessor<TState>
  ): Observable<Action> {

    val subject = Subject<Action>()

    val enhancedProcessor: EffectProcessor<TState> = {
      processor(it).tap(subject)
    }

    processors += enhancedProcessor

    return subject
  }

  protected fun <TAction : Action> processingOfType(
    type: KClass<TAction>,
    processor: EffectProcessorOfAction<TState, TAction>
  ): Observable<Action> {

    return processing {
      processor(
        it.filter { type.isInstance(it.second) }
          .unsafeCast<Observable<Pair<TState, TAction>>>()
      )
    }
  }

  protected inline fun <reified TAction : Action> processingOfType(
    noinline processor: EffectProcessorOfAction<TState, TAction>
  ): Observable<Action> {

    return processingOfType(TAction::class, processor)
  }
}
