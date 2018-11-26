package kodando.runtime.async

import kotlinx.coroutines.await
import kotlin.js.Promise

suspend inline fun <T> await(promise: Promise<T>) = promise.await()
