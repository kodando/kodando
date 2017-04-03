package kodando.react

import kotlin.js.Json

external interface PropTypeDefinition {
	operator fun get(key: String): ((props: Json, propName: String, componentName: String) -> Error?)?
	operator fun set(key: String, value: ((props: Json, propName: String, componentName: String) -> Error?)?)
}