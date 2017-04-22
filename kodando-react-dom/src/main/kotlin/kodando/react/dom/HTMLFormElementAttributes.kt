package kodando.react.dom

open class HTMLFormElementAttributes : HTMLElementAttributes() {
    var action: String? by jsonProperty
    var method: String? by jsonProperty
    var autocomplete: String? by jsonProperty
    var encoding: String? by jsonProperty
    var enctype: String? by jsonProperty
    var target: String? by jsonProperty
}