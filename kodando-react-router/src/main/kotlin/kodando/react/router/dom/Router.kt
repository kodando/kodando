package kodando.react.router.dom

import kodando.react.PropSetter
import kodando.react.ReactElement
import kodando.react.createElement

/**
 * Created by danfma on 04/04/17.
 */

fun router(setter: PropSetter<RouterProps>): ReactElement? {
    return createElement(Module.RouterClass, RouterProps().apply(setter))
}
