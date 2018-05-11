package kodando.react.router.dom

import kodando.react.Configurer
import kodando.react.ReactProps
import kodando.react.addComponent
import kodando.react.createProps

/**
 * Created by danfma on 04/04/17.
 */

fun ReactProps.switch(configurer: Configurer<SwitchProps>) {
  addComponent(Module.SwitchClass, createProps(configurer))
}
