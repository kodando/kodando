package kodando.mobx.react

import kodando.react.Component
import kodando.react.ReactProps
import kodando.react.Renderer
import kotlin.reflect.KClass

fun <T : Component<*, *>> makeObserver(type: JsClass<T>): JsClass<T> =
  MobxReact.observer(type)

inline fun <reified T : Component<*, *>> makeObserver(type: KClass<T>): JsClass<T> =
  MobxReact.observer(type.js)

fun <TProps : ReactProps> makeObserver(renderer: Renderer<TProps>): Renderer<TProps> =
  MobxReact.observer(renderer)
