package kodando.react.dom

open class HTMLBaseElementAttributes : HTMLElementAttributes() {
    var href: String? by jsonProperty
    var target: String? by jsonProperty
}

