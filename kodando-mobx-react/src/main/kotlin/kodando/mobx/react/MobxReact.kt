package kodando.mobx.react

import kodando.react.Component

/**
 * Created by danfma on 16/01/2017.
 */

@JsModule("mobx-react")
@JsNonModule
external object MobxReact {
    fun <T : JsClass<out Component<*, *>>> observer(component: T): T
}

