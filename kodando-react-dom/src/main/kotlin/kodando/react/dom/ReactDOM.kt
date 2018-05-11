package kodando.react.dom

import kodando.react.ReactNode
import org.w3c.dom.Node

@JsModule("react-dom")
@JsNonModule
external object ReactDOM {
  fun render(node: ReactNode?, container: Node)
  fun unmountComponentAtNode(container: Node)
  fun createPortal(node: ReactNode?, container: Node): ReactNode?
}