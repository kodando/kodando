package kodando.react

import kotlin.js.Json

external interface AnyPropType {
	// a type expression definition will be nice here
	val isRequired: (props: Json, propName: String, componentName: String) -> Error?
}
