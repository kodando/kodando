package kodando.react.router

import kodando.react.Component
import kodando.react.ComponentBuilder
import kodando.react.PropSetter
import kodando.react.ReactElement
import kodando.react.router.ReactRouter.HashRouter
import kodando.react.router.ReactRouter.Link
import kodando.react.router.ReactRouter.Match

/**
 * Created by danfma on 18/01/2017.
 */


private val hashRouterFactory = HashRouter::class.js
private val matchFactory = Match::class.js
private val linkFactory = Link::class.js


object hashRouter : ComponentBuilder<HashRouterProps>(hashRouterFactory) {

    operator fun invoke(basename: String, populator: HashRouterProps.() -> Unit): ReactElement? {
        return this.invoke {
            this.basename = basename
            this.populator()
        }
    }

}


object match : ComponentBuilder<MatchProps>(matchFactory) {

    operator fun invoke(pattern: String, component: JsClass<out Component<*, *>>, exactly: Boolean = false): ReactElement? {
        return this.invoke {
            this.pattern = pattern
            this.component = component
            this.exactly = exactly
        }
    }

    operator fun invoke(pattern: String, exactly: Boolean = false, render: () -> ReactElement?): ReactElement? {
        return this.invoke {
            this.pattern = pattern
            this.exactly = exactly
            this.render = { render() }
        }
    }
}


object routerLink : ComponentBuilder<LinkProps>(linkFactory) {

    operator fun invoke(to: String, className: String? = null, propSetter: PropSetter<LinkProps>) =
        super.invoke {
            this.to = to
            this.className = className
            this.propSetter()
        }

}
