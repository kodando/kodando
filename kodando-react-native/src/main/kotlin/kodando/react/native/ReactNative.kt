@file:JsModule("react-native")

package kodando.react.native

import kodando.react.ReactComponent
import kodando.react.ReactProps
import org.w3c.dom.Node


external interface TextProps : ReactProps {
    var style: Style?
}

external interface ViewProps : ReactProps {
    var style: Style?
    var accessibilityLabel: Node?
    var accessible: Boolean?
    var hitSlop: HitSlop?
    var nativeID: String?
}

external interface ScrollViewProps : ReactProps

external interface ImageProps : ReactProps {
    var source: ImageSource
    var style: Style?
}

external interface ImageSource


external val Text: JsClass<ReactComponent<TextProps, Unit>>

external val View: JsClass<ReactComponent<ViewProps, Unit>>

external val ScrollView: JsClass<ReactComponent<ScrollViewProps, Unit>>

external val Image: JsClass<ReactComponent<ImageProps, Unit>>
