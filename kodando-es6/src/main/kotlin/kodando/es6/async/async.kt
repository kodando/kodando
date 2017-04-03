package kodando.es6.async

import kotlin.coroutines.experimental.Continuation
import kotlin.coroutines.experimental.CoroutineContext
import kotlin.coroutines.experimental.EmptyCoroutineContext
import kotlin.coroutines.experimental.startCoroutine
import kotlin.js.Promise

/**
 * Created by danfma on 17/01/2017.
 */

fun <T> async(block: suspend () -> T): Future<T> {
    val promise = Promise<T> { resolve, reject ->
        block.startCoroutine(completion = object : Continuation<T> {
            override val context: CoroutineContext = EmptyCoroutineContext

            override fun resume(value: T) {
                resolve(value)
            }

            override fun resumeWithException(exception: Throwable) {
                reject(exception)
            }
        })
    }

    return Future(promise)
}

