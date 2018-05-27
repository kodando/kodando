package kodando.jest

import kodando.runtime.async.asyncPromise

class Fit(private val description: String) {

  @JsName("byChecking")
  infix fun byChecking(handler: () -> Unit) {
    fit(description) {
      handler()
      undefined
    }
  }

  @JsName("byCheckingWhenDone")
  infix fun <T> byCheckingAfter(handler: suspend () -> T) {
    fitAsync(description) {
      asyncPromise(handler)
    }
  }

}