package kodando.react.dom.events

import org.w3c.dom.Element

external interface TouchEvent<TElement : Element> : SyntheticEvent<TElement> {
	var altKey: Boolean?
	var changedTouches: TouchList
	var ctrlKey: Boolean?
	var metaKey: Boolean?
	var shiftKey: Boolean?
	var targetTouches: TouchList
	var touches: TouchList
	fun getModifierState(key: String): Boolean
}