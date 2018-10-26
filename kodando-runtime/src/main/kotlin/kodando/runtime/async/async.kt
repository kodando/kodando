package kodando.runtime.async

import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine
import kotlin.js.Promise

/**
 * Created by danfma on 17/01/2017.
 */

fun <T> async(block: suspend () -> T): Promise<T> {
  return Promise { resolve, reject ->
    block.startCoroutine(completion = object : Continuation<T> {
      override val context: CoroutineContext = EmptyCoroutineContext

      override fun resumeWith(result: Result<T>) {
        result.fold(
          { resolve(it) },
          { reject(it) }
        )
      }
    })
  }
}
