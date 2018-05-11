package kodando.react.native

import kodando.react.Configurer
import kodando.react.unsafelyCreateObject

@JsName("createStyle")
fun createStyle(): Style =
  unsafelyCreateObject()

@JsName("createStyleAndConfigure")
fun createStyle(configure: Configurer<Style>): Style =
  createStyle().also(configure)
