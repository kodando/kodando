package kodando.react.native

import kodando.react.Configurer
import kodando.react.ReactProps
import kodando.react.addComponent
import kodando.react.createProps

class ImageUri(val uri: String) : ImageSource

fun ReactProps.image(configure: Configurer<ImageProps>) {
  addComponent(Image, createProps(configure))
}
