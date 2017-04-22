package kodando.react.dom

import kodando.react.dom.events.SyntheticEvent
import org.w3c.dom.HTMLBodyElement

open class HTMLBodyElementAttributes : HTMLElementAttributes() {
    var background: String? by jsonProperty
    var onLoad: ((SyntheticEvent<HTMLBodyElement>) -> Unit)? by jsonProperty
}

