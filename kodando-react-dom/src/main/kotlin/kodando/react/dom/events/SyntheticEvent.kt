package kodando.react.dom.events

import org.w3c.dom.Node
import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget
import kotlin.js.Date

/**
 * Created by danfma on 02/06/2016.
 */

external interface SyntheticEvent<TNode : Node> {
  var currentTarget: TNode
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
