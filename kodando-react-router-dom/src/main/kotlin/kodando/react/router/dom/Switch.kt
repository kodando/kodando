package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

fun ReactProps.switch(configurer: Configurer<SwitchProps>) {
    addComponent(Module.SwitchClass, createProps(configurer))
}
