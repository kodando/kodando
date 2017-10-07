package kodando.react.dom

import kodando.react.*
import org.w3c.dom.Node


fun render(node: ReactNode?, container: Node) =
    ReactDOM.render(node, container)

fun umountComponentAtNode(container: Node) =
    ReactDOM.unmountComponentAtNode(container)

fun portal(container: Node, configurer: Configurer<ReactProps>) =
    ReactDOM.createPortal(
        root(configurer),
        container
    )
