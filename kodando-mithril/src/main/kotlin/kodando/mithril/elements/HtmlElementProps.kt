package kodando.mithril.elements

import kodando.mithril.Props
import org.w3c.dom.events.MouseEvent

external interface HtmlElementProps : Props {
    @JsName("class")
    var className: String

    @JsName("onclick")
    var onClick: (MouseEvent) -> Unit
}