package kodando.jest

/**
 * Created by danfma on 11/02/2017.
 */

external fun test(name: String, handler: () -> Unit)

external fun describe(name: String, handler: () -> Unit)

@JsName("it")
external fun it(description: String, expectationHandler: () -> Any)