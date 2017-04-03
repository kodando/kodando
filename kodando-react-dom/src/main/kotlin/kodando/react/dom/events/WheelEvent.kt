package kodando.react.dom.events

import org.w3c.dom.Element

external interface WheelEvent<TElement : Element> : SyntheticEvent<TElement> {
	var deltaMode: Number
	var deltaX: Number
	var deltaY: Number
	var deltaZ: Number
}