package kodando.react.router.dom

import kodando.react.PropSetter
import kodando.react.ReactElement
import kodando.react.createElement

/**
 * Created by danfma on 04/04/17.
 */

internal fun link(setter: PropSetter<LinkProps>): ReactElement? {
    return createElement(Module.LinkClass, LinkProps().apply(setter))
}


@JsName("linkToUrl")
fun link(toUrl: String, replace: Boolean? = null, setter: PropSetter<LinkProps>): ReactElement? {
    return link {
        this.toUrl = toUrl
        this.replace = replace ?: undefined
        this.setter()
    }
}


@JsName("linkToLocation")
fun link(toLocation: Location, replace: Boolean? = null, setter: PropSetter<LinkProps>): ReactElement? {
    return link {
        this.toLocation = toLocation
        this.replace = replace ?: undefined
        this.setter()
    }
}

