package kodando.react.native

import kodando.react.*

fun ReactProps.view(configure: Configurer<ViewProps>) {
    addComponent(View, createProps(configure))
}
