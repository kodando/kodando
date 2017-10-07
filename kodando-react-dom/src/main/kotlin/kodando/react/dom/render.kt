package kodando.react.dom

import kodando.react.ReactNode
import org.w3c.dom.Node


fun render(node: ReactNode?, container: Node) =
    ReactDOM.render(node, container)
