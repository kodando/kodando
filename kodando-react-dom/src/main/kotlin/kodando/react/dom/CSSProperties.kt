package kodando.react.dom

// This @JsName interface is not complete. Only properties accepting
// unitless Numbers are listed here (see CSSProperty.js in React)
external interface CSSProperties {
    var boxFlex: Number?
    var boxFlexGroup: Number?
    var columnCount: Number?

    @JsName("flex")
    var flex: String?

    @JsName("flex")
    var flexValue: Number?

    var flexGrow: Number?
    var flexShrink: Number?

    @JsName("fontWeight")
    var fontWeight: Number?

    @JsName("fontWeight")
    var fontWeightWithUnit: String?

    var lineClamp: Number?

    @JsName("lineHeight")
    var lineHeight: Number?

    @JsName("lineHeight")
    var lineHeightWithUnit: String?

    var opacity: Number?
    var order: Number?
    var orphans: Number?
    var widows: Number?
    var zIndex: Number?
    var zoom: Number?

    @JsName("fontSize")
    var fontSize: Number?

    @JsName("fontSize")
    var fontSizeWithUnit: String?

    // SVG-related properties
    var fillOpacity: Number?
    var strokeOpacity: Number?
    var strokeWidth: Number?

    var backgroundImage: String?
}

fun CSSProperties.set(property: String, value: Any) {
    this.asDynamic()[property] = value
}
