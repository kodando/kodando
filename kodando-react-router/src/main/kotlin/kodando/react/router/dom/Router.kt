package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

val routerBuilder = ComponentBuilder(Module.RouterClass)


fun ReactProps.router(setter: PropSetter<RouterProps>) {
    append(routerBuilder.build(setter))
}
