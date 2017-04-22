package kodando.react.router.dom

import kodando.react.PropSetter
import kodando.react.ReactElement
import kodando.react.createElement

/**
 * Created by danfma on 04/04/17.
 */

fun hashRouter(setter: PropSetter<HashRouterProps>): ReactElement? {
    return createElement(Module.HashRouterClass, HashRouterProps().apply(setter))
}
