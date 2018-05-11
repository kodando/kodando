package kodando.react.native

import kodando.react.Configurer
import kodando.react.ReactProps
import kodando.react.addComponent
import kodando.react.createProps

fun ReactProps.scrollView(configure: Configurer<ScrollViewProps>) {
  addComponent(ScrollView, createProps(configure))
}
