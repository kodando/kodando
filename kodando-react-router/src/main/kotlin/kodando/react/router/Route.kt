package kodando.react.router

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

@JsName("route")
fun route(propSetter: PropSetter<RouteProps>): ReactElement? {
    return React.createElement(Module.RouteClass, propsBy(propSetter))
}


@JsName("routeWithPath")
fun route(path: String, propSetter: PropSetter<RouteProps>): ReactElement? {
    return route {
        this.path = path
        this.propSetter()
    }
}


@JsName("routeWithComponent")
fun route(
    path: String,
    component: Component<Routeable, *>,
    exact: Boolean? = null,
    strict: Boolean? = null): ReactElement? {

    return route {
        this.path = path
        this.component = component
        this.exact = exact ?: undefined
        this.strict = strict ?: undefined
    }
}


@JsName("routeRenderized")
fun routeRenderized(
    path: String,
    exact: Boolean? = null,
    strict: Boolean? = null,
    render: (Routeable) -> ReactElement?): ReactElement? {

    return route {
        this.path = path
        this.render = render
        this.exact = exact ?: undefined
        this.strict = strict ?: undefined
    }
}

