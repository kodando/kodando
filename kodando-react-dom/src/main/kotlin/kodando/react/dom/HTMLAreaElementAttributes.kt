package kodando.react.dom

open class HTMLAreaElementAttributes : HTMLElementAttributes() {
    var alt: String? by jsonProperty
    var href: String? by jsonProperty
}

