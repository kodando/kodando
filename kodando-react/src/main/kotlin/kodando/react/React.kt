package kodando.react

import kotlin.js.*

@JsModule("react")
@JsNonModule
external object React {

    @JsName("PropTypes")
    val propTypes: PropTypes

    @JsName("createElement")
    fun createElement(
        function: (Json) -> ReactElement?,
        props: Json,
        vararg children: Any?): ReactElement

    @JsName("createElement")
    fun createElement(
        elementName: String,
        props: ReactProps?,
        vararg children: Any?): ReactElement

    @JsName("createElement")
    fun createElement(
        elementName: String,
        props: Json,
        vararg children: Any?): ReactElement

    @JsName("createElement")
    fun <T : Component<*, *>> createElement(
        componentType: JsClass<T>,
        props: ReactProps?,
        vararg children: Any?): TypedReactElement<T>

    @JsName("createElement")
    fun <T : Component<*, *>> createElement(
        componentType: JsClass<T>,
        props: Json?,
        vararg children: Any?): TypedReactElement<T>

}

