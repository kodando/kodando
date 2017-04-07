package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

internal fun link(setter: PropSetter<LinkProps>): ReactElement? {
    return React.createElement(Module.LinkClass, unsafePropsBy(setter))
}


@JsName("linkToUrl")
fun link(toUrl: String, replace: Boolean? = null): ReactElement? {
    return link {
        this.toUrl = toUrl
        this.replace = replace ?: undefined
    }
}


@JsName("linkToLocation")
fun link(toLocation: Location, replace: Boolean? = null): ReactElement? {
    return link {
        this.toLocation = toLocation
        this.replace = replace ?: undefined
    }
}

