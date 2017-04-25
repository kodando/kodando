package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

val switchBuilder = ComponentBuilder(Module.SwitchClass)


fun RouterProps.switch(propSetter: PropSetter<SwitchProps>) {
    append(switchBuilder.build(propSetter))
}
