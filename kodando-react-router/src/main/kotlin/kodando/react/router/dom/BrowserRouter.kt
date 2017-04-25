package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 24/04/17.
 */

val BrowserRouter = ComponentBuilder(Module.BrowserRouterClass)


fun ReactProps.browserRouter(setter: PropSetter<BrowserRouterProps>) =
    append(BrowserRouter(setter))
