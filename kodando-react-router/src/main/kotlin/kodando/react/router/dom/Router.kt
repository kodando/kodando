package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

fun router(setter: PropSetter<RouterProps>): ReactElement? {
    return React.createElement(Module.RouterClass, unsafePropsBy(setter))
}
