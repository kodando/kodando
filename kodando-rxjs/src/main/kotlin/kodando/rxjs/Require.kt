package kodando.rxjs

import kotlin.js.Json

external interface ImportedModule : Json

@JsName("require")
internal external fun fromModule(moduleName: String): ImportedModule

inline infix fun <T> ImportedModule.import(name: String): T {
  return this[name].unsafeCast<T>()
}
