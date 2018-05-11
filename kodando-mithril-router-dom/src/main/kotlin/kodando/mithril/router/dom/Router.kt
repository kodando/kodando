package kodando.mithril.routing

import kodando.history.BrowserHistoryInstance
import kodando.mithril.*
import kodando.mithril.context.contextProvider
import kotlin.js.json

external interface RouterProps : Props {
  var history: BrowserHistoryInstance
}

object Router : View<RouterProps>, OnInit<RouterProps>, OnCreate<RouterProps>, OnRemove<RouterProps> {

  private lateinit var match: Match
  private lateinit var unlisten: () -> Unit

  private fun computeMatch(pathName: String): Match {
    return Match(
      path = "/",
      url = "/",
      params = json(),
      isExact = pathName === "/"
    )
  }

  override fun onInit(vnode: VNode<RouterProps>) {
    val history = vnode.attrs?.history

    if (history === null) {
      throw Error("You should specify the history property")
    }

    match = computeMatch(history.location.pathname)
  }

  override fun onCreate(vnode: VNode<RouterProps>) {
    val history = vnode.attrs?.history!!
    val children = vnode.children

    if (children.isEmpty() || children.size > 1) {
      throw Error("A <Router> may have only one child element")
    }

    unlisten = history.listen { location, _ ->
      match = computeMatch(location.pathname)
      redraw()
    }
  }

  override fun onRemove(vnode: VNode<RouterProps>) {
    unlisten()
  }

  override fun view(vnode: VNode<RouterProps>): VNode<*>? {
    val history = vnode.attrs?.history!!

    val routeContext = RouterContext(
      history = history,
      route = RouteMatch(
        location = history.location,
        match = match
      ),
      router = this
    )

    return root {
      contextProvider(routerContextKey, routeContext) {
        addChild(
          vnode.children.singleOrNull()
        )
      }
    }
  }
}

fun Props.router(applier: Applier<RouterProps>) {
  addChild(Router, applier)
}
