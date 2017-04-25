package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

val Router = ComponentBuilder(Module.RouterClass)


fun ReactProps.router(setter: PropSetter<RouterProps>) {
    append(Router(setter))
}
