package kodando.react.router.dom

import kodando.react.ReactElement
import kodando.react.createElement

/**
 * Created by danfma on 04/04/17.
 */

@JsName("promptWithText")
fun prompt(message: String, matched: Boolean = false): ReactElement? {
    return createElement(Module.PromptClass, PromptProps().apply {
        this.messageText = message
        this.matched = matched
    })
}


@JsName("promptWithFunc")
fun prompt(messageFactory: (Location) -> String, matched: Boolean = false): ReactElement? {
    return createElement(Module.PromptClass, PromptProps().apply {
        this.messageFunc = messageFactory
        this.matched = matched
    })
}
