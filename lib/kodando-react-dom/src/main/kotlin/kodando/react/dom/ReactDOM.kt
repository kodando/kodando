package kodando.react.dom

import kodando.react.Component
import kodando.react.ReactElement
import kodando.react.TypedReactElement
import org.w3c.dom.Element


@JsModule("react-dom")
@JsNonModule
external object ReactDOM {

    @JsName("render")
    fun render(element: ReactElement, container: Element): Component<*, *>

    @JsName("render")
    fun <T : Component<*, *>> render(element: TypedReactElement<T>, container: Element): T

}

