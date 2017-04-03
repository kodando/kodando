package kodando.react.dom.events

import org.w3c.dom.Element

external interface KeyboardEvent<TElement : Element> : SyntheticEvent<TElement> {
	var altKey: Boolean?
	var charCode: Number
	var ctrlKey: Boolean?
	var key: String?
	var keyCode: Number?
	var locale: String?
	var location: Number?
	var metaKey: Boolean?
	var repeat: Boolean?
	var shiftKey: Boolean?
	var which: Number?
	fun getModifierState(key: String): Boolean
}