package kodando.mithril.routing

import kodando.history.BrowserHistoryInstance
import kodando.history.Location
import kodando.mithril.context.ContextKey
import kotlin.js.Json

data class RouterContext(
    val history: BrowserHistoryInstance,
    val route: RouteMatch,
    val router: Router
)

data class RouteMatch(
    val location: Location,
    val match: Match
)

data class Match(
    val path: String,
    val url: String,
    val params: Json,
    val isExact: Boolean
)

val routerContextKey = ContextKey<RouterContext>("mithril.router")
