package kodando.react.dom.events

import org.w3c.dom.Element
import org.w3c.dom.events.EventTarget

external interface MouseEvent<TElement : Element> : SyntheticEvent<TElement> {
	var altKey: Boolean?
	var button: Number?
	var buttons: Number?
	var clientX: Number?
	var clientY: Number?
	var ctrlKey: Boolean?
	var metaKey: Boolean?
	var pageX: Number?
	var pageY: Number?
	var relatedTarget: EventTarget?
	var screenX: Number?
	var screenY: Number?
	var shiftKey: Boolean?
	fun getModifierState(key: String): Boolean
}