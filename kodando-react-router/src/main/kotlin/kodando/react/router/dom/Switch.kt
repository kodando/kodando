package kodando.react.router.dom

import kodando.react.PropSetter
import kodando.react.ReactElement
import kodando.react.createElement

/**
 * Created by danfma on 04/04/17.
 */

fun switch(propSetter: PropSetter<SwitchProps>): ReactElement? {
    return createElement(Module.SwitchClass, SwitchProps().apply(propSetter))
}
