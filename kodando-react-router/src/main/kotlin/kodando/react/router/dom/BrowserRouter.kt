package kodando.react.router.dom

import kodando.react.PropSetter
import kodando.react.ReactElement
import kodando.react.createElement

/**
 * Created by danfma on 04/04/17.
 */

fun browserRouter(setter: PropSetter<BrowserRouterProps>): ReactElement? {
    return createElement(Module.BrowserRouterClass, BrowserRouterProps().apply(setter))
}
