package kodando.react.dom.events

import org.w3c.dom.Element

external interface UIEvent<TElement : Element> : SyntheticEvent<TElement> {
	var detail: Number
	var view: AbstractView?
}