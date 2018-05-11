package kodando.react.dom.events

import org.w3c.dom.Node

external interface UIEvent<TNode : Node> : SyntheticEvent<TNode> {
  var detail: Number
  var view: AbstractView?
}