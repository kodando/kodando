package kodando.react.dom.events

import org.w3c.dom.Element
import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget
import kotlin.js.Date

/**
 * Created by danfma on 02/06/2016.
 */

external interface SyntheticEvent<TElement : Element> {
	var currentTarget: TElement
	var bubbles: Boolean?
	var cancelable: Boolean?
	var defaultPrevented: Boolean?
	var eventPhase: Number?
	var isTrusted: Boolean?
	var nativeEvent: Event?
	var target: EventTarget?
	var timeStamp: Date?
	var type: String?
	fun preventDefault(): Unit
	fun stopPropagation(): Unit
}
