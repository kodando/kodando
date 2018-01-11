package kodando.jest

import kotlin.js.Promise

class It(private val description: String) {

    @JsName("byChecking")
    infix fun byChecking(handler: () -> Unit) {
        it(description, handler)
    }

    @JsName("byCheckingWhenDone")
    infix fun byCheckingWhenDone(handler: () -> Promise<*>) {
        itAsync(description, handler)
    }

}
