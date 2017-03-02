package kodando.react

import kotlin.js.Json

class PropTypeBuilder<T : Component<TProps, *>, TProps> {
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
		val props = objectOf<PropTypeDefinition>()

		for ((key, value) in restrictions) {
			props[key] = value
		}

		factory.asDynamic().propTypes = props
	}

}