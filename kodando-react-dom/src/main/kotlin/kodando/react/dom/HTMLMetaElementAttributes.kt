package kodando.react.dom

open class HTMLMetaElementAttributes : HTMLElementAttributes() {
    var charset: String? by jsonProperty
    var content: String? by jsonProperty
    var scheme: String? by jsonProperty
    var url: String? by jsonProperty
}

