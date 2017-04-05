package kodando.react.router

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

fun browserRouter(setter: PropSetter<BrowserRouterProps>): ReactElement? {
    return React.createElement(Module.BrowserRouterClass, propsBy(setter))
}
