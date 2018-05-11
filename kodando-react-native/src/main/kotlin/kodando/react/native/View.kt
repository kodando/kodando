package kodando.react.native

import kodando.react.Configurer
import kodando.react.ReactProps
import kodando.react.addComponent
import kodando.react.createProps

fun ReactProps.view(configure: Configurer<ViewProps>) {
  addComponent(View, createProps(configure))
}
