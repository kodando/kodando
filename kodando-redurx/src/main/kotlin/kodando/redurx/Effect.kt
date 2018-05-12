package kodando.redurx

import kodando.rxjs.Observable
import kodando.rxjs.Subject
import kodando.rxjs.Unsubscribable
import kodando.rxjs.operators.ofType
import kodando.rxjs.operators.switchMap
import kodando.rxjs.subscribeWith
import kotlin.reflect.KClass

abstract class Effect : Subject<Action>() {

  private val actionSS = Subject<Observable<Action>>()
  private val actionS = actionSS.switchMap { it }
  private val subscriptions = mutableListOf<Unsubscribable>()

  override fun complete() {
    super.complete()
    actionSS.complete()
  }

  fun activate(actionSource: Observable<Action>) {
    actionSS.next(actionSource)
  }

  protected fun processing(
    processor: (Observable<Action>) -> Observable<Action>
  ): Observable<Action> {

    val subject = Subject<Action>()

    subscriptions.add(
      processor(actionS).subscribeWith {
        next = {
          next(it)
          subject.next(it)
        }

        error = {
          error(it)
          subject.error(it)
        }

        complete = {
          subject.complete()
        }
      }
    )

    return subject
  }

  protected fun <TAction : Action> processingOfType(
    type: KClass<TAction>,
    processor: (Observable<TAction>) -> Observable<Action>
  ): Observable<Action> {

    return processing {
      processor(it.ofType(type))
    }
  }

  protected inline fun <reified TAction : Action> processingOfType(
    noinline processor: (Observable<TAction>) -> Observable<Action>
  ): Observable<Action> {

    return processingOfType(TAction::class, processor)
  }
}
