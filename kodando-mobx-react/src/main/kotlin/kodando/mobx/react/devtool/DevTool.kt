package kodando.mobx.react.devtool

import kodando.react.Component
import kodando.react.ReactElement

@JsModule("react-mobx-devtools")
@JsNonModule
external object DevTool {

    @JsName("default")
    class Tool : Component<DevToolsProps, Unit> {
        override fun render(): ReactElement?
    }

}
