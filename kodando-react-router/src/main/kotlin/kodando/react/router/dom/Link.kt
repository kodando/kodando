package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 24/04/17.
 */

val Link = ComponentBuilder(Module.LinkClass)


private fun ReactProps.routerLink(setter: PropSetter<LinkProps>) =
    append(Link(setter))


@JsName("linkToUrl")
fun ReactProps.routerLink(toUrl: String, replace: Boolean? = null, setter: PropSetter<LinkProps>) {
    routerLink {
        this.toUrl = toUrl
        this.replace = replace ?: undefined
        this.setter()
    }
}


@JsName("linkToLocation")
fun ReactProps.routerLink(toLocation: Location, replace: Boolean? = null, setter: PropSetter<LinkProps>) {
    routerLink {
        this.toLocation = toLocation
        this.replace = replace ?: undefined
        this.setter()
    }
}

