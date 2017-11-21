package kodando.react

import org.w3c.dom.Node

@JsModule("react")
@JsNonModule
external object React {

    @JsName("createElement")
    fun createElement(tagOrFunctionOrType: Any, props: Any?, vararg children: Any?): ReactNode?

    @JsName("createPortal")
    fun createPortal(node: ReactNode, domNode: Node): ReactNode

    @JsName("createPortal")
    fun createPortal(children: ReactChildren, domNode: Node): ReactNode

}
