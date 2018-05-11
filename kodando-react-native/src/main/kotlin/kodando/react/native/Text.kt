package kodando.react.native

import kodando.react.*

fun ReactProps.text(configure: Configurer<TextProps>) {
  addComponent(Text, createProps(configure))
}

fun ReactProps.text(value: String) {
  addComponent(Text) {
    add(value)
  }
}
