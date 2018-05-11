package kodando.mithril.routing

import kodando.history.Location
import kodando.mithril.*
import kodando.mithril.context.contextConsumer

external interface RouteProps : Props {
  var computedMatch: Match?
  var location: Location?
  var path: String?
  var exact: Boolean
  var strict: Boolean
  var sensitive: Boolean
  var view: View<*>
  var render: (RoutedProps) -> VNode<*>?
}

object Route : View<RouteProps> {
  private fun computeMatch(props: RouteProps, context: RouterContext): Match? {
    val computedMatch = props.computedMatch

    if (computedMatch != null) {
      return computedMatch
    }

    val route = context.route
    val pathName = (props.location ?: context.route.location).pathname

    return matchPath(
      pathName,
      props.path,
      props.strict,
      props.exact,
      props.sensitive,
      route.match
    )
  }

  override fun view(vnode: VNode<RouteProps>): VNode<*>? {
    val attrs = vnode.attrs ?: return null

    return root {
      contextConsumer(routerContextKey) { context ->
        val route = context.route
        val history = context.history
        val location = attrs.location ?: route.location
        val match = computeMatch(attrs, context)
        val routedProps = routedProps(match, location, history)

        if (addView(attrs.view, routedProps)) {
          return@contextConsumer
        }

        if (addRender(attrs.render, routedProps)) {
          return@contextConsumer
        }

        addChildren(vnode.children, match)
      }
    }
  }

  private fun Props.addView(view: View<*>, routedProps: RoutedProps): Boolean {
    if (view === undefined) {
      return false
    }

    val match = routedProps.match

    addChild(
      match?.let {
        createElement(view, routedProps)
      }
    )

    return true
  }

  private fun Props.addRender(render: (RoutedProps) -> VNode<*>?, routedProps: RoutedProps): Boolean {
    if (render === undefined) {
      return false
    }

    val match = routedProps.match

    addChild(
      match?.let {
        render(routedProps)
      }
    )

    return true
  }

  private fun Props.addChildren(children: Array<out VNode<*>?>, match: Match?) {
    val child = children.firstOrNull()

    addChild(
      match?.let {
        child
      }
    )
  }
}

fun Props.route(
  path: String,
  exact: Boolean = true,
  strict: Boolean = false,
  applier: Props.(RoutedProps) -> Unit) {

  addChild(Route) {
    this.path = path
    this.exact = exact
    this.strict = strict
    this.render = {
      root {
        applier(it)
      }
    }
  }
}

fun Props.route(applier: Applier<RouteProps>) {
  addChild(Route, applier)
}
