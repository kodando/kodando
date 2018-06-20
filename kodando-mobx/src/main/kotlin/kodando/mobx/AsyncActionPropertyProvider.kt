package kodando.mobx

import kotlin.coroutines.experimental.Continuation
import kotlin.coroutines.experimental.CoroutineContext
import kotlin.coroutines.experimental.startCoroutine
import kotlin.js.Promise
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class AsyncActionPropertyProvider<T, R>(private val action: SuspendableAsyncFunc<T, R>) {
  operator fun provideDelegate(thisRef: Any, property: KProperty<*>): ReadOnlyProperty<Any, AsyncFunc<T, Promise<R>>> {
    val actionName = ActionId.create(thisRef::class, property)

    val action = Mobx.action(actionName) { input: T ->
      Promise<R> { resolve, reject ->
        this.action.startCoroutine(input, completion = object : Continuation<R> {
          override val context: CoroutineContext = ActionCoroutineContext(actionName)

          override fun resume(value: R) {
            resolve(value)
          }

          override fun resumeWithException(exception: Throwable) {
            reject(exception)
          }
        })
      }
    }

    return ReadOnlyValueProperty(action)
  }
}
