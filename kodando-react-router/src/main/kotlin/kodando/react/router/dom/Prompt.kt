package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

val Prompt = ComponentBuilder(Module.PromptClass)


private fun ReactProps.prompt(setter: PropSetter<PromptProps>) {
    append(Prompt(setter))
}


@JsName("promptWithText")
fun ReactProps.prompt(message: String, matched: Boolean = false) {
    prompt {
        this.messageText = message
        this.matched = matched
    }
}


@JsName("promptWithFunc")
fun ReactProps.prompt(messageFactory: (Location) -> String, matched: Boolean = false) {
    prompt {
        this.messageFunc = messageFactory
        this.matched = matched
    }
}
