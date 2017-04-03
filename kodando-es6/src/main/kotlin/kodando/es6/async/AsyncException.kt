package kodando.es6.async

class AsyncException(val error: Throwable) : Exception("Error while waiting for result")