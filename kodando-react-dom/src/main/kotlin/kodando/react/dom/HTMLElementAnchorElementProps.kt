package kodando.react.dom

open class HTMLElementAnchorElementProps : HTMLElementAttributes() {
    var href: String? by jsonProperty
    var hrefLang: String? by jsonProperty
    var rel: String? by jsonProperty
}
