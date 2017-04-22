package kodando.react.dom

import kodando.react.dom.events.SyntheticEvent
import org.w3c.dom.HTMLIFrameElement

open class HTMLIFrameElementAttributes : HTMLElementAttributes() {
    var align: String? by jsonProperty
    var disabled: Boolean? by jsonProperty
    var border: String? by jsonProperty
    var scrolling: String? by jsonProperty
    var src: String? by jsonProperty
    var vspace: Number? by jsonProperty
    var onLoad: ((SyntheticEvent<HTMLIFrameElement>) -> Unit)? by jsonProperty
}