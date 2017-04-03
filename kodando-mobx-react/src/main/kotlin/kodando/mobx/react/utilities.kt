package kodando.mobx.react

import kodando.react.Component
import kotlin.reflect.KClass

/**
 * Created by danfma on 17/01/2017.
 */

fun <T : Component<*, *>> makeObserver(type: JsClass<T>): JsClass<T> =
    MobxReact.observer(type)

fun <T : Component<*, *>> makeObserver(type: KClass<T>): JsClass<T> =
    makeObserver(type.js)
