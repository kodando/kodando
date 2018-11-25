package kodando.jest

import kodando.runtime.async.async

class It(private val description: String) {

  @JsName("byChecking")
  infix fun byChecking(handler: () -> Unit) {
    it(description) {
      handler()
      undefined
    }
  }

  @JsName("byCheckingWhenDone")
  infix fun <T> byCheckingAfter(handler: suspend () -> T) {
    itAsync(description) {
      async(handler)
    }
  }

}

