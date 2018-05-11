package kodando.mithril.routing

import kodando.mithril.*
import kodando.mithril.context.contextConsumer

external interface SwitchProps : Props

object Switch : View<SwitchProps> {
  override fun view(vnode: VNode<SwitchProps>): VNode<*>? {
    return root {
      contextConsumer(routerContextKey) {
        val routeMatch = it.route
        val children = vnode.children
        val (match, child) = findMatchingChild(children, routeMatch)

        addChild(
          match?.let { match ->
            child?.attrs?.also {
              val routeProps = it as RouteProps

              routeProps.location = routeMatch.location
              routeProps.computedMatch = match
            }

            child
          }
        )
      }
    }
  }

  private fun findMatchingChild(
    children: Array<out VNode<*>>,
    routeMatch: RouteMatch
  ): Pair<Match?, VNode<*>?> {

    val location = routeMatch.location

    for (child in children) {
      val childProps = child.attrs.unsafeCast<RouteProps?>() ?: continue
      val path = childProps.path
      val exact = childProps.exact
      val strict = childProps.strict
      val sensitive = childProps.sensitive

      val match = matchPath(
        pathName = location.pathname,
        path = path,
        exact = exact,
        strict = strict,
        sensitive = sensitive,
        parentMatch = routeMatch.match
      )

      if (match != null) {
        return match to child
      }
    }

    return null to null
  }
}

fun Props.switch(applier: Applier<SwitchProps>) {
  addChild(Switch, applier)
}
