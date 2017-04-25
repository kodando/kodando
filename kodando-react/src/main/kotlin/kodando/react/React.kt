package kodando.react

import kotlin.reflect.KClass


@JsModule("react")
@JsNonModule
external object React {

    @JsName("PropTypes")
    val propTypes: PropTypes

    @JsName("createElement")
    fun createElement(
        component: Any,
        props: ReactProps?,
        vararg children: Any?): ReactElement

}


/**
 * Create a stateless component (component defined by a function).
 */
@JsName("reactCreateStatelessElement")
fun <TProps : ReactProps> createElement(
    function: (TProps) -> ReactElement?,
    props: TProps? = null,
    vararg children: Any?): ReactElement {

    return React.createElement(
        function,
        props,
        *children
    )
}


/**
 * Create a DOM element (component defined by its name)
 */
@JsName("reactCreateDOMElement")
fun createElement(
    elementName: String,
    props: ReactProps? = null,
    vararg children: Any?): ReactElement {

    return React.createElement(
        elementName,
        props,
        *children
    )
}


/**
 * Create a component (component defined as a class).
 */
@JsName("reactCreateComponent")
fun <T : Component<*, *>> createElement(
    componentType: JsClass<T>,
    props: ReactProps?,
    vararg children: Any?): TypedReactElement<T> {

    return React.createElement(
        componentType,
        props,
        *children
    ).unsafeCast<TypedReactElement<T>>()
}


/**
 * Create a component (component defined as a class).
 */
@JsName("reactCreateKClassComponent")
fun <T : Component<*, *>> createElement(
    componentType: KClass<T>,
    props: ReactProps?,
    vararg children: Any?): TypedReactElement<T> {

    return createElement(componentType.js, props, *children)
}
