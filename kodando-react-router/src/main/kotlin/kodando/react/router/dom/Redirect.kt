package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

val Redirect = ComponentBuilder(Module.RedirectClass)


private fun ReactProps.redirect(setter: PropSetter<RedirectProps>) {
    append(Redirect(setter))
}


@JsName("redirectToUrl")
fun ReactProps.redirect(to: String, from: String? = null, push: Boolean? = null) {
    redirect {
        this.toUrl = to
        this.from = from ?: undefined
        this.push = push ?: undefined
    }
}


@JsName("redirectToLocation")
fun ReactProps.redirect(location: Location, from: String? = null, push: Boolean? = null) {
    redirect {
        this.toLocation = location
        this.from = from ?: undefined
        this.push = push ?: undefined
    }
}
