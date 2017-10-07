package kodando.react.dom.events

import org.w3c.dom.Node
import org.w3c.dom.events.EventTarget

external interface FocusEvent<TNode : Node> : SyntheticEvent<TNode> {
    var relatedTarget: EventTarget?
}