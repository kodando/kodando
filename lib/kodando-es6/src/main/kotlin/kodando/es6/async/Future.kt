package kodando.es6.async

import kodando.es6.Promise

class Future<T>(private val promise: Promise<T>) {

	infix fun <R> continueWith(handler: (T) -> R): Future<R> {
		return Future(promise.then(handler))
	}

	infix fun catch(handler: (Error) -> T): Future<T> {
		return Future(promise.catchAndMap(handler))
	}

	infix fun finally(handler: () -> Unit) {
		console.log("REGISTERING THE FINALLY")
		promise
			.then {
				console.log("finally in then")
				handler()
			}
			.catch {
				console.log("finally in catch")
				handler()
			}
	}

}