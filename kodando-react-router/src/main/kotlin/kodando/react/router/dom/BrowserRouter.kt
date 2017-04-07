package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

fun browserRouter(setter: PropSetter<BrowserRouterProps>): ReactElement? {
    return React.createElement(Module.BrowserRouterClass, unsafePropsBy(setter))
}
