package kodando.react

import kotlin.reflect.KClass

open class ComponentBuilder<TComponent : Component<TProps, *>, TProps : ReactProps>(
    val componentType: JsClass<TComponent>,
    val propsFactory: (() -> TProps)? = null) : Builder<TProps> {

    constructor(
        componentType: KClass<TComponent>,
        propsFactory: (() -> TProps)? = null)
        : this(componentType.js, propsFactory)

    override fun build(setter: PropSetter<TProps>): ReactElement? {
        val props = propsFactory?.invoke() ?: unsafePropsOf()
        props.setter()

        return createElement(componentType, props)
    }

}
