package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

@JsName("route")
fun ReactProps.route(configurer: Configurer<RouteProps>) {
  addComponent(Module.RouteClass, createProps(configurer))
}


@JsName("routeWithPath")
fun ReactProps.route(path: String, configurer: Configurer<RouteProps>) {
  route {
    this.path = path
    this.configurer()
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
  render: (Routeable) -> ReactNode?) {

  route {
    this.path = path
    this.render = render
    this.exact = exact ?: undefined
    this.strict = strict ?: undefined
  }
}
