package kodando.react.router

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

fun switch(propSetter: PropSetter<SwitchProps>): ReactElement? {
    return React.createElement(Module.SwitchClass, propsBy(propSetter))
}
