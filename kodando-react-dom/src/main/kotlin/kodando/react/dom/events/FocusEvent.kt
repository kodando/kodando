package kodando.react.dom.events

import org.w3c.dom.Element
import org.w3c.dom.events.EventTarget

external interface FocusEvent<TElement : Element> : SyntheticEvent<TElement> {
	var relatedTarget: EventTarget?
}