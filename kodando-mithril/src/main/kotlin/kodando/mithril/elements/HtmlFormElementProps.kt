package kodando.mithril.elements

import kodando.mithril.EventHandlerWithArgument
import org.w3c.dom.events.Event

external interface HtmlFormElementProps : HtmlElementProps {
    var action: String?
    var method: String?
    var autocomplete: String?
    var encoding: String?
    var enctype: String?
    var target: String?

    @JsName("onsubmit")
    var onSubmit: EventHandlerWithArgument<Event>?
}