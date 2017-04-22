package showroom

import kodando.react.*
import kodando.react.dom.*
import kodando.react.router.dom.*
import showroom.time.Clock

object Shell : StatelessRenderer<Shell.Props>(::Props) {

    class Props : ReactProps()

    override fun render(props: Props): ReactElement? {
        return div {
            +Clock {
                name = "Goiânia"
                width = 150
            }

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