package kodando.react.dom.events

import org.w3c.dom.Node

external interface WheelEvent<TNode : Node> : SyntheticEvent<TNode> {
  var deltaMode: Number
  var deltaX: Number
  var deltaY: Number
  var deltaZ: Number
}