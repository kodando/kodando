package kodando.mobx.react

import kodando.react.ReactProps
import kodando.react.Renderer

@JsModule("mobx-react")
external object MobxReact {
  @JsName("observer")
  fun <T : Any> observer(type: JsClass<T>): JsClass<T>

  @JsName("observer")
  fun <TProps : ReactProps> observer(renderer: Renderer<TProps>): Renderer<TProps>
}

