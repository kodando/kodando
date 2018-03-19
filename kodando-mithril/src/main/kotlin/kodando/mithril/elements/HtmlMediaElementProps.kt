package kodando.mithril.elements

external interface HtmlMediaElementProps : HtmlElementProps {
    var autoplay: Boolean?
    var controls: Boolean?
    var loop: Boolean?
    var muted: Boolean?
    var preload: String?
    var src: String?
    var volume: Int?
}

