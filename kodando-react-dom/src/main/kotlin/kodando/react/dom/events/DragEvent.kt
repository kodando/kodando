package kodando.react.dom.events

import org.w3c.dom.DataTransfer
import org.w3c.dom.Node

external interface DragEvent<TNode : Node> : SyntheticEvent<TNode> {
  var dataTransfer: DataTransfer?
}