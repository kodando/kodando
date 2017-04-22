package kodando.react.router.dom

import kodando.history.History
import kodando.react.Component
import kodando.react.ReactElement
import kodando.react.ReactProps
import kodando.react.Style
import kotlin.js.*

/**
 * Created by danfma on 04/04/17.
 */

typealias Callback = (allowTransition: Boolean) -> Unit


open class RouterProps : ReactProps() {
    var basename: String? by jsonProperty
    var getUserConfirmation: ((message: String, callback: Callback) -> Unit)? by jsonProperty
}


class BrowserRouterProps : RouterProps() {
    var forceRefresh: Boolean? by jsonProperty
    var keyLength: Int? by jsonProperty
}


class HashRouterProps : RouterProps() {
    var hashType: String? by jsonProperty
}


interface RouteTo {
    var to: Any?
}


class LinkProps : ReactProps(), RouteTo {
    var replace: Boolean? by jsonProperty
    override var to: Any? by jsonProperty
}


class NavLinkProps : ReactProps() {
    var activeClassName: String? by jsonProperty
    var activeStyle: Style? by jsonProperty
    var exact: Boolean? by jsonProperty
    var strict: Boolean? by jsonProperty
    var isActive: ((Match?, Location) -> Boolean)? by jsonProperty
}


class PromptProps : ReactProps() {
    var message: Any? by jsonProperty

    @JsName("when")
    var matched: Boolean? by jsonProperty
}


class RedirectProps : ReactProps(), RouteTo {
    var push: Boolean? by jsonProperty
    var from: String? by jsonProperty
    override var to: Any? by jsonProperty
}


interface Routeable {
    var match: Match
    var location: Location
    var history: History
}


class RouteProps : ReactProps() {
    var component: Component<Routeable, *>? by jsonProperty
    var render: (Routeable) -> ReactElement? by jsonProperty
    var path: String? by jsonProperty
    var exact: Boolean? by jsonProperty
    var strict: Boolean? by jsonProperty
}


class SwitchProps : ReactProps()


data class Location(
    val pathname: String,
    var search: String? = null,
    var hash: String? = null,
    var state: Any? = null
)


interface Match {
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
