package kodando.react.router

import kodando.history.History
import kodando.react.*
import kotlin.js.*

/**
 * Created by danfma on 04/04/17.
 */

typealias Callback = (allowTransition: Boolean) -> Unit


interface RouterProps : ReactProps {
    var basename: String?
    var getUserConfirmation: (message: String, callback: Callback) -> Unit
}


interface BrowserRouterProps : RouterProps {
    var forceRefresh: Boolean?
    var keyLength: Int?
}


interface HashRouterProps : RouterProps {
    var hashType: String?
}


interface RouteTo {
    var to: Any
}


interface LinkProps : ReactProps, RouteTo {
    var replace: Boolean?
}


interface NavLinkProps : ReactProps {
    var activeClassName: String?
    var activeStyle: Style?
    var exact: Boolean?
    var strict: Boolean?
    var isActive: (Match?, Location) -> Boolean
}


interface PromptProps : ReactProps {
    var message: Any

    @JsName("when")
    var matched: Boolean
}


interface RedirectProps : ReactProps, RouteTo {
    var push: Boolean?
    var from: String?
}


interface Routeable {
    var match: Match
    var location: Location
    var history: History
}


interface RouteProps : ReactProps {
    var component: Component<Routeable, *>?
    var render: (Routeable) -> ReactElement?
    var path: String?
    var exact: Boolean?
    var strict: Boolean?
}


interface SwitchProps : ReactProps


data class Location(
    val pathname: String,
    var search: String? = null,
    var hash: String? = null,
    var state: Any? = null
)


interface Match {
    var params: Json
}


@JsModule("react-router")
@JsNonModule
external object Module {

    @JsName("Router")
    val RouterClass: JsClass<Router>

    @JsName("BrowserRouter")
    val BrowserRouterClass: JsClass<BrowserRouter>

    @JsName("HashRouter")
    val HashRouterClass : JsClass<HashRouter>

    @JsName("Prompt")
    val PromptClass: JsClass<Prompt>

    @JsName("Redirect")
    val RedirectClass: JsClass<Redirect>

    @JsName("Route")
    val RouteClass: JsClass<Route>

    @JsName("Link")
    val LinkClass: JsClass<Link>

    @JsName("Switch")
    val SwitchClass: JsClass<Switch>


    @JsName("Router")
    class Router : Component<RouterProps, Unit> {
        override fun render(): ReactElement?
    }

    @JsName("BrowserRouter")
    class BrowserRouter : Component<BrowserRouterProps, Unit> {
        override fun render(): ReactElement?
    }

    @JsName("HashRouter")
    class HashRouter : Component<HashRouterProps, Unit> {
        override fun render(): ReactElement?
    }

    @JsName("Prompt")
    class Prompt : Component<PromptProps, Unit> {
        override fun render(): ReactElement?
    }

    @JsName("Redirect")
    class Redirect : Component<RedirectProps, Unit> {
        override fun render(): ReactElement?
    }

    @JsName("Route")
    class Route : Component<RouteProps, Unit> {
        override fun render(): ReactElement?
    }

    @JsName("Link")
    class Link : Component<LinkProps, Unit> {
        override fun render(): ReactElement?
    }

    @JsName("Switch")
    class Switch : Component<SwitchProps, Unit> {
        override fun render(): ReactElement?
    }

}
