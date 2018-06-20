package kodando.mobx.react.devtools

import kodando.react.Component
import kodando.react.ReactProps
import kodando.react.addComponent

@JsModule("mobx-react-devtools")
external object MobxDevTool {

  @JsName("default")
  val DevTool: JsClass<Component<DevToolProps, Unit>>

  interface DevToolProps : ReactProps {
    var position: Any
  }

}

fun ReactProps.mobxDevTool() {
  addComponent(MobxDevTool.DevTool)
}
