package showroom

import kodando.react.*
import kodando.react.dom.*
import kodando.react.router.dom.*
import showroom.time.clock


object Shell : StatelessRenderer<Shell.Props>() {

    interface Props : ReactProps

    override fun render(props: Props): ReactElement? {
        return ksx {
            div {
                clock {
                    name = "Goiânia"
                    width = 150
                }

                h1 {
                    append("My super application in React")
                }

                hashRouter {
                    div {
                        div {
                            routerLink("/") {
                                append("Home")
                            }

                            routerLink("/about") {
                                append("About")
                            }
                        }

                        routeRenderized("/", exact = true) {
                            ksx {
                                div {
                                    append("Home view")
                                }
                            }
                        }

                        routeRenderized("/about") {
                            ksx {
                                div {
                                    h2 {
                                        append("About kodando")
                                    }

                                    append("Kodando is a library that provides to you React bindings for kotlin2js.")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}