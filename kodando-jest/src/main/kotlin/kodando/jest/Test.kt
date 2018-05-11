package kodando.jest

import kotlin.js.Promise

class Test(private val description: String) {
  infix fun byChecking(handler: () -> Unit) {
    test(description, handler)
  }

  infix fun byCheckingWhenDone(handler: () -> Promise<*>) {
    testAsync(description, handler)
  }
}