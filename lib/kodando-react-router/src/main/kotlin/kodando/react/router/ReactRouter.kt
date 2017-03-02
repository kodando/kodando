package kodando.react.router


import kodando.react.Component
import kodando.react.ReactElement

@JsModule("react-router")
@JsNonModule
external object ReactRouter {

    class HashRouter : Component<HashRouterProps, Unit> {
        override fun render(): ReactElement?
    }

    class Match : Component<MatchProps, Unit> {
        override fun render(): ReactElement?
    }

    class Link : Component<LinkProps, Unit> {
        override fun render(): ReactElement?
    }

}
