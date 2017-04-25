package kodando.runtime.async

class AsyncException(val error: Throwable) : Exception("Error while waiting for result")