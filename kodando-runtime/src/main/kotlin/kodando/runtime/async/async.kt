package kodando.runtime.async

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.promise
import kotlin.coroutines.CoroutineContext
import kotlin.js.Promise

/**
 * Created by danfma on 17/01/2017.
 */

fun <T> async(block: suspend () -> T): Promise<T> {
  val scope = object : CoroutineScope {
    override val coroutineContext: CoroutineContext = Job()
  }

  return scope.promise {
    block()
  }
}
