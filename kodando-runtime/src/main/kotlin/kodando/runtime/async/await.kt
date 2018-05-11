package kodando.runtime.async

import kotlin.coroutines.experimental.suspendCoroutine
import kotlin.js.Promise

/**
 * Created by danfma on 17/01/2017.
 */

suspend fun <T> await(block: Promise<T>): T =
  suspendCoroutine { c ->
    block
      .then { data -> c.resume(data) }
      .catch { error -> c.resumeWithException(AsyncException(error)) }
  }

suspend fun <T> await(block: Future<T>): T =
  suspendCoroutine { c ->
    block
      .continueWith { data -> c.resume(data) }
      .catch { error -> c.resumeWithException(AsyncException(error)) }
  }
