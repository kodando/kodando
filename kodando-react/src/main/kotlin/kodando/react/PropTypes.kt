package kodando.react

import kotlin.js.Json


external interface PropTypes {
    @JsName("any")
    val forAny: AnyPropType
}


external interface AnyPropType {
    // a type expression definition will be nice here
    val isRequired: (props: Json, propName: String, componentName: String) -> Error?
}


external interface PropTypeDefinition {
    operator fun get(key: String): ((props: Json, propName: String, componentName: String) -> Error?)?
    operator fun set(key: String, value: ((props: Json, propName: String, componentName: String) -> Error?)?)
}


class PropTypeBuilder<T : Component<TProps, *>, out TProps : ReactProps> {

    val restrictions = hashMapOf<String, (props: Json, propName: String, componentName: String) -> Error?>()
    private fun memberOf(selector: (TProps) -> Any?): String {
        val regex = Regex("""it\.(.*);""")
        val result = regex.find(selector.toString()) ?: throw Error("Defina a seleção do membro usando uma expressão simples com o parâmetro 'it'.")

        return result.groupValues[1]
    }

    fun <TProperty> required(selector: (TProps) -> TProperty) {
        val memberName = memberOf(selector)
        val restriction = React.propTypes.forAny.isRequired

        restrictions.put(memberName, restriction)
    }

    fun applyTo(factory: JsClass<T>) {
        val props = objectWithShapeOf<PropTypeDefinition>()

        for ((key, value) in restrictions) {
            props[key] = value
        }

        factory.asDynamic().propTypes = props
    }

}


fun <TComponent : Component<TProps, *>, TProps : ReactProps> propTypesOf(factory: JsClass<TComponent>, configure: PropTypeBuilder<TComponent, TProps>.() -> Unit) {
    val propTypeBuilder = PropTypeBuilder<TComponent, TProps>()

    propTypeBuilder.configure()
    propTypeBuilder.applyTo(factory)
}
