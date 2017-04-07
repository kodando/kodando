package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

fun switch(propSetter: PropSetter<SwitchProps>): ReactElement? {
    return React.createElement(Module.SwitchClass, unsafePropsBy(propSetter))
}
