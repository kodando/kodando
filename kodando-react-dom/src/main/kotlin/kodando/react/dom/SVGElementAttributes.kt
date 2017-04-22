package kodando.react.dom

open class SVGElementAttributes : HTMLElementAttributes() {
    var viewBox: String? by jsonProperty
    var preserveAspectRatio: String? by jsonProperty
}