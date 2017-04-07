package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */


@JsName("redirectToUrl")
fun redirect(to: String, from: String? = null, push: Boolean? = null): ReactElement? {
    return React.createElement(Module.RedirectClass, unsafePropsBy<RedirectProps> {
        this.toUrl = to
        this.from = from ?: undefined
        this.push = push ?: undefined
    })
}


@JsName("redirectToLocation")
fun redirect(location: Location, from: String? = null, push: Boolean? = null): ReactElement? {
    return React.createElement(Module.RedirectClass, unsafePropsBy<RedirectProps> {
        this.toLocation = location
        this.from = from ?: undefined
        this.push = push ?: undefined
    })
}
