@file:Suppress("unused")

package kodando.jest

import kotlin.js.Promise

@JsName("describe")
external fun describe(name: String, handler: () -> Unit)

@JsName("test")
external fun test(name: String, handler: () -> Unit)

@JsName("test")
external fun testAsync(name: String, handler: () -> Promise<*>)

@JsName("it")
external fun it(description: String, expectationHandler: () -> Any?)

@JsName("it")
external fun itAsync(description: String, expectationHandler: () -> Promise<*>)

@JsName("xit")
external fun xit(description: String, expectationHandler: () -> Any?)

@JsName("xit")
external fun xitAsync(description: String, expectationHandler: () -> Promise<*>)

@JsName("fit")
external fun fit(description: String, expectationHandler: () -> Any?)

@JsName("fit")
external fun fitAsync(description: String, expectationHandler: () -> Promise<*>)

@JsName("beforeEach")
external fun beforeEach(setup: Function<*>)

@JsName("afterEach")
external fun afterEach(setup: Function<*>)
