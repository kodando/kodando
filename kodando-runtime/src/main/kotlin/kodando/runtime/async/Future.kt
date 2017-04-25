package kodando.runtime.async

import kotlin.js.Promise

class Future<T>(private val promise: Promise<T>) {

    infix fun <R> continueWith(handler: (T) -> R): Future<R> {
        return Future(promise.then(handler))
    }

    infix fun catch(handler: (Throwable) -> T): Future<T> {
        return Future(promise.catch(handler))
    }

    infix fun finally(handler: () -> Unit) {
        console.log("REGISTERING THE FINALLY")
        promise
            .then(
                onFulfilled = {
                    console.log("finally in then")
                    handler()
                }
            )
            .catch {
                console.log("finally in catch")
                handler()
            }
    }

}