@file:Suppress("UnsafeCastFromDynamic")

package kodando.mithril.elements

external interface HtmlElementProps : HtmlNodeProps {
    var accept: String?

    var acceptCharset: String?

    @JsName("accesskey")
    var accessKey: String?

    var allowFullScreen: Boolean?

    var allowTransparency: Boolean?

    var async: Boolean?

    var autoComplete: Boolean?

    var autoPlay: Boolean?

    var charSet: String?

    var checked: Boolean?

    var classID: String?

    var cols: Number?

    var colSpan: Number?

    var contentEditable: Boolean?

    var contextMenu: String?

    var coords: String?

    var crossOrigin: String?

    var dataValue: String?

    var dateTime: String?

    var defaultChecked: Boolean?

    var defaultValue: String?

    var defer: Boolean?

    var dir: String?

    var download: Any?

    var draggable: Boolean?

    var encType: String?

    var form: String?

    var formAction: String?

    var formEncType: String?

    var formMethod: String?

    var formNoValidate: Boolean?

    var formTarget: String?

    var frameBorder: Any?

    var headers: String?

    var height: Any?

    var hidden: Boolean?

    var high: Number?

    var htmlFor: String?

    var httpEquiv: String?

    var icon: String?

    var label: String?

    var lang: String?

    var list: String?

    var low: Number?

    var manifest: String?

    var marginHeight: Number?

    var marginWidth: Number?

    var max: Any?

    var maxLength: Number?

    var mediaGroup: String?

    var min: Any?

    var name: String?

    var noValidate: Boolean?
    var open: Boolean?

    var optimum: Number?

    var pattern: String?

    var poster: String?

    var radioGroup: String?

    var readOnly: Boolean?

    var required: Boolean?

    var role: String?

    var rows: Number?

    var rowSpan: Number?

    var sandbox: String?

    var scope: String?

    var scoped: Boolean?

    var seamless: Boolean?

    var selected: Boolean?

    var shape: String?

    var sizes: String?

    var spellCheck: Boolean?

    var srcDoc: String?

    var srcSet: String?

    var start: Number?

    var step: Any?

    var style: Css?

    var tabIndex: Number?

    var title: String?

    var useMap: String?

    var width: Any?

    var wmode: String?

// Non-standard Attributes

    var autoCapitalize: Boolean?

    var autoCorrect: Boolean?

    var property: String?

    var itemProp: String?

    var itemScope: Boolean?

    var itemType: String?

    var unselectable: Boolean?

}
