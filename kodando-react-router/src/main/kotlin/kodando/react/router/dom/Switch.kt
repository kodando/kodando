package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

val Switch = ComponentBuilder(Module.SwitchClass)


fun RouterProps.switch(setter: PropSetter<SwitchProps>) {
    append(Switch(setter))
}
