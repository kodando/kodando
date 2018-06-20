package kodando.react

import kotlin.reflect.KClass

fun <TProps : ReactProps> Renderer<TProps>.withDisplayName(name: String): Renderer<TProps> {
  return this.also {
    it.asDynamic().displayName = name
  }
}

fun <TProps : ReactProps> Renderer<TProps>.withDisplayName(type: KClass<*>): Renderer<TProps> {
  return this.withDisplayName(type.simpleName ?: "Custom")
}
