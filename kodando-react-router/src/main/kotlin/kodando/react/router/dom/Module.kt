package kodando.react.router.dom

import kodando.history.History
import kodando.react.*
import kodando.react.dom.Css
import kotlin.js.*

/**
 * Created by danfma on 04/04/17.
 */

typealias Callback = (allowTransition: Boolean) -> Unit


external interface RouterProps : ReactProps {
    var basename: String?
    var getUserConfirmation: ((message: String, callback: Callback) -> Unit)?
}


external interface BrowserRouterProps : RouterProps {
    var forceRefresh: Boolean?
    var keyLength: Int?
}


external interface HashRouterProps : RouterProps {
    var hashType: String?
}


external interface RouteTo {
    var to: Any?
}


external interface LinkProps : ReactProps, RouteTo {
    var replace: Boolean?
}


external interface NavLinkProps : ReactProps {
    var activeClassName: String?
    var activeStyle: Css?
    var exact: Boolean?
    var strict: Boolean?
    var isActive: ((Match?, Location) -> Boolean)?
}


external interface PromptProps : ReactProps {
    var message: Any?

    @JsName("when")
    var matched: Boolean?
}


external interface RedirectProps : ReactProps, RouteTo {
    var push: Boolean?
    var from: String?
    override var to: Any?
}


external interface Routeable : ReactProps {
    var match: Match
    var location: Location
    var history: History
}


external interface RouteProps : ReactProps {
    var component: ReactComponent<Routeable, *>?
    var render: (Routeable) -> ReactNode?
    var path: String?
    var exact: Boolean?
    var strict: Boolean?
}


external interface SwitchProps : ReactProps


data class Location(
    val pathname: String,
    var search: String? = null,
    var hash: String? = null,
    var state: Any? = null
)


external interface Match {
    var params: Json
}


@JsModule("react-router-dom")
@JsNonModule
external object Module {

    @JsName("Router")
    val RouterClass: JsClass<Router>

    @JsName("BrowserRouter")
    val BrowserRouterClass: JsClass<BrowserRouter>

    @JsName("HashRouter")
    val HashRouterClass: JsClass<HashRouter>

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
    class Router : ReactComponent<RouterProps, Unit> {
        override fun render(): ReactNode?
    }

    @JsName("BrowserRouter")
    class BrowserRouter : ReactComponent<BrowserRouterProps, Unit> {
        override fun render(): ReactNode?
    }

    @JsName("HashRouter")
    class HashRouter : ReactComponent<HashRouterProps, Unit> {
        override fun render(): ReactNode?
    }

    @JsName("Prompt")
    class Prompt : ReactComponent<PromptProps, Unit> {
        override fun render(): ReactNode?
    }

    @JsName("Redirect")
    class Redirect : ReactComponent<RedirectProps, Unit> {
        override fun render(): ReactNode?
    }

    @JsName("Route")
    class Route : ReactComponent<RouteProps, Unit> {
        override fun render(): ReactNode?
    }

    @JsName("Link")
    class Link : ReactComponent<LinkProps, Unit> {
        override fun render(): ReactNode?
    }

    @JsName("Switch")
    class Switch : ReactComponent<SwitchProps, Unit> {
        override fun render(): ReactNode?
    }

}
