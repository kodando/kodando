package kodando.react

import kotlin.reflect.KClass

open class ComponentBuilder<TProps : ReactProps>(
    val componentType: JsClass<out Component<TProps, *>>,
    val propsFactory: () -> TProps = { unsafePropsOf<TProps>() }) {

    constructor(componentType: KClass<out Component<TProps, *>>) : this(componentType.js)

    operator fun invoke(propsSetter: PropSetter<TProps>): ReactElement? {
        return createElement(componentType, propsFactory().apply(propsSetter))
    }

}
