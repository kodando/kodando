package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 24/04/17.
 */

val browserRouterBuilder = ComponentBuilder(Module.BrowserRouterClass)


fun ReactProps.browserRouter(setter: PropSetter<BrowserRouterProps>) =
    append(browserRouterBuilder.build(setter))
