package kodando.mithril.elements

import kodando.mithril.EventHandlerWithArgument
import org.w3c.dom.events.Event

external interface HtmlIFrameElementProps : HtmlElementProps {
    var align: String?
    var disabled: Boolean?
    var border: String?
    var scrolling: String?
    var src: String?
    var vspace: Number?

    @JsName("onload")
    var onLoad: EventHandlerWithArgument<Event>?
}