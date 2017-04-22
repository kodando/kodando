package kodando.react.dom

open class HTMLLinkElementAttributes : HTMLElementAttributes() {
    var charset: String? by jsonProperty
    var disabled: Boolean? by jsonProperty
    var href: String? by jsonProperty
    var hreflang: String? by jsonProperty
    var media: String? by jsonProperty
    var rel: String? by jsonProperty
    var rev: String? by jsonProperty
    var target: String? by jsonProperty
    var type: String? by jsonProperty
}

