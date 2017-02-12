package kodando.es6.async

class AsyncException(val error: Error) : Exception("Error while waiting for result")