package kodando.jest

import kodando.runtime.async.asyncPromise

class Xit(private val description: String) {

  @JsName("byChecking")
  infix fun byChecking(handler: () -> Unit) {
    xit(description) {
      handler()
      undefined
    }
  }

  @JsName("byCheckingWhenDone")
  infix fun <T> byCheckingAfter(handler: suspend () -> T) {
    xitAsync(description) {
      asyncPromise(handler)
    }
  }

}
