package kodando.mobx

import kotlin.coroutines.CoroutineContext

class ActionCoroutineContext(override val actionName: String) : CoroutineContext, ActionContext {
  override fun <E : CoroutineContext.Element> get(key: CoroutineContext.Key<E>): E? = null
  override fun <R> fold(initial: R, operation: (R, CoroutineContext.Element) -> R): R = initial
  override fun plus(context: CoroutineContext): CoroutineContext = context
  override fun minusKey(key: CoroutineContext.Key<*>): CoroutineContext = this
  override fun hashCode(): Int = 0
  override fun toString(): String = "EmptyCoroutineContext"
}
