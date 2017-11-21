package kodando.react.native

import kodando.react.*

class ImageUri(val uri: String) : ImageSource

fun ReactProps.image(configure: Configurer<ImageProps>) {
    addComponent(Image, createProps(configure))
}
