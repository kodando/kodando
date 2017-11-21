package kodando.react.native

import kodando.react.*

fun ReactProps.scrollView(configure: Configurer<ScrollViewProps>) {
    addComponent(ScrollView, createProps(configure))
}
