package kodando.react.router

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

fun hashRouter(setter: PropSetter<HashRouterProps>): ReactElement? {
    return React.createElement(Module.HashRouterClass, propsBy(setter))
}
