package kodando.react.dom

import org.w3c.dom.HTMLMediaElement

external interface HtmlMediaElementProps : HtmlElementProps<HTMLMediaElement> {
    var autoplay: Boolean?
    var controls: Boolean?
    var loop: Boolean?
    var muted: Boolean?
    var preload: String?
    var src: String?
    var volume: Int?
}

