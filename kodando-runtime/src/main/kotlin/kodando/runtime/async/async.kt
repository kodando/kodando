@file:Suppress("EXPERIMENTAL_FEATURE_WARNING")

package kodando.runtime.async

import kotlin.coroutines.experimental.*
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

fun <T> asyncPromise(block: suspend () -> T) = async(block).toPromise()
