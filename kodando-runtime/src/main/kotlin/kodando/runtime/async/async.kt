package kodando.runtime.async

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.promise
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.js.Promise

/**
 * Created by danfma on 17/01/2017.
 */

private val asyncScope = object : CoroutineScope {
  override val coroutineContext: CoroutineContext = EmptyCoroutineContext
}

fun <T> async(block: suspend () -> T): Promise<T> {
  console.log("Before starting the coroutines")

  return asyncScope.promise {
    block()
  }
}
