package kodando.react

import kotlin.reflect.KClass

open class ComponentBuilder<TProps : ReactProps>(
    val componentType: JsClass<out Component<TProps, *>>) : ElementBuilder<TProps>() {

    constructor(componentType: KClass<out Component<TProps, *>>) : this(componentType.js)

    override operator fun invoke(propsSetter: PropSetter<TProps>): ReactElement? {
        val (children, props) = extractChildren(emptyPropsOf(propsSetter))

        return React.createElement(componentType, props, *children)
    }

}
