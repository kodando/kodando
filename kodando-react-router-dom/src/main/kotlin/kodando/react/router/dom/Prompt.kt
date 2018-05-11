package kodando.react.router.dom

import kodando.react.Configurer
import kodando.react.ReactProps
import kodando.react.addComponent
import kodando.react.createProps

/**
 * Created by danfma on 04/04/17.
 */

private inline fun ReactProps.prompt(configurer: Configurer<PromptProps>) {
  addComponent(Module.PromptClass, createProps(configurer))
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
