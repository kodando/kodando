package kodando.runtime.async

import kotlin.coroutines.suspendCoroutine
import kotlin.js.Promise

/**
 * Created by danfma on 17/01/2017.
 */

suspend fun <T> await(promise: Promise<T>): T =
  suspendCoroutine { c ->
    promise
      .then { data -> c.resumeWith(Result.success(data)) }
      .catch { error -> c.resumeWith(Result.failure(AsyncException(error))) }
  }

suspend inline fun <T> Promise<T>.await(): T = await(this)
