package kodando.react.dom

open class HTMLMediaElementAttributes : HTMLElementAttributes() {
    var autoplay: Boolean? by jsonProperty
    var controls: Boolean? by jsonProperty
    var loop: Boolean? by jsonProperty
    var muted: Boolean? by jsonProperty
    var preload: String? by jsonProperty
    var src: String? by jsonProperty
    var volume: Int? by jsonProperty
}

