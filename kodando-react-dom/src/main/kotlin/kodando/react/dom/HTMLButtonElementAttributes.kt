package kodando.react.dom

open class HTMLButtonElementAttributes : HTMLElementAttributes() {
    var autoFocus: Boolean? by jsonProperty
    var disabled: Boolean? by jsonProperty
    var type: String? by jsonProperty
}

