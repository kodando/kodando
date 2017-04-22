package kodando.react.dom

open class HTMLInputElementAttributes : HTMLElementAttributes() {
    var autoFocus: Boolean? by jsonProperty
    var disabled: Boolean? by jsonProperty
    var placeholder: String? by jsonProperty
    var type: String? by jsonProperty
    var value: String? by jsonProperty
}

