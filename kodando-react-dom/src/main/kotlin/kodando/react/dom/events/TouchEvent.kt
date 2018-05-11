package kodando.react.dom.events

import org.w3c.dom.Node

external interface TouchEvent<TNode : Node> : SyntheticEvent<TNode> {
  var altKey: Boolean?
  var changedTouches: TouchList
  var ctrlKey: Boolean?
  var metaKey: Boolean?
  var shiftKey: Boolean?
  var targetTouches: TouchList
  var touches: TouchList
  fun getModifierState(key: String): Boolean
}