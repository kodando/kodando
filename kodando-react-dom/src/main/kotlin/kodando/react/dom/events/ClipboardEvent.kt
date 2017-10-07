package kodando.react.dom.events

import org.w3c.dom.DataTransfer
import org.w3c.dom.Node

external interface ClipboardEvent<TNode : Node> : SyntheticEvent<TNode> {
    var clipboardData: DataTransfer?
}