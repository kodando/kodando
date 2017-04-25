package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

val Route = ComponentBuilder(Module.RouteClass)


@JsName("route")
fun ReactProps.route(setter: PropSetter<RouteProps>) {
    append(Route(setter))
}


@JsName("routeWithPath")
fun ReactProps.route(path: String, propSetter: PropSetter<RouteProps>) {
    route {
        this.path = path
        this.propSetter()
    }
}


@JsName("routeWithComponent")
fun ReactProps.route(
    path: String,
    component: Component<Routeable, *>,
    exact: Boolean? = null,
    strict: Boolean? = null) {

    route {
        this.path = path
        this.component = component
        this.exact = exact ?: undefined
        this.strict = strict ?: undefined
    }
}


@JsName("routeRenderized")
fun ReactProps.routeRenderized(
    path: String,
    exact: Boolean? = null,
    strict: Boolean? = null,
    render: (Routeable) -> ReactElement?) {

    route {
        this.path = path
        this.render = render
        this.exact = exact ?: undefined
        this.strict = strict ?: undefined
    }
}
