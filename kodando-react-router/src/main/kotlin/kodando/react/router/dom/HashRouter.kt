package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 24/04/17.
 */


val hashRouterBuilder = ComponentBuilder(Module.HashRouterClass)


fun ReactProps.hashRouter(setter: PropSetter<HashRouterProps>) =
    append(hashRouterBuilder.build(setter))

