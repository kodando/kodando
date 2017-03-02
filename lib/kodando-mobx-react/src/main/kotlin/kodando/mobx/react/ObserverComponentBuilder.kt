package kodando.mobx.react

import kodando.react.Component
import kodando.react.ComponentBuilder
import kodando.react.ReactProps
import kotlin.reflect.KClass

/**
 * Created by danfma on 29/01/2017.
 */

open class ObserverComponentBuilder<TProps : ReactProps>(componentType: JsClass<out Component<TProps, *>>)
    : ComponentBuilder<TProps>(makeObserver(componentType)) {

    constructor(componentType: KClass<out Component<TProps, *>>)
        : this(componentType.js)

}