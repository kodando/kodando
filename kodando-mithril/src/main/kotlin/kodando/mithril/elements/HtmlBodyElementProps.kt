package kodando.mithril.elements

import kodando.mithril.EventHandlerWithArgument
import org.w3c.dom.events.Event

external interface HtmlBodyElementProps : HtmlElementProps {
    var background: String?
    var onLoad: EventHandlerWithArgument<Event>?
}

