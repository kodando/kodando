package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

fun ReactProps.router(configurer: Configurer<RouterProps>) {
    addComponent(Module.RouterClass, createProps(configurer))
}
