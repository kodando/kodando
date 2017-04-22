package showroom

import kodando.react.ReactElement
import kodando.react.ReactProps
import kodando.react.StatelessRenderer
import kodando.react.dom.div
import kodando.react.dom.h1
import kodando.react.dom.h2
import kodando.react.router.dom.hashRouter
import kodando.react.router.dom.link
import kodando.react.router.dom.routeRenderized

object Shell : StatelessRenderer<Shell.Props>(::Props) {

    class Props : ReactProps()

    override fun render(props: Props): ReactElement? {
        return div {
            +h1 {
                +"My super application in React"
            }

            +hashRouter {
                +div {
                    +div {
                        +link("/") {
                            +"Home"
                        }

                        +link("/about") {
                            +"About"
                        }
                    }

                    +routeRenderized("/", exact = true) {
                        div {
                            +"Home view"
                        }
                    }

                    +routeRenderized("/about") {
                        div {
                            +h2 {
                                +"About kodando"
                            }

                            +"""Kodando is a library that provides to you React bindings for kotlin2js."""
                        }
                    }
                }
            }
        }
    }
}