package sample1

import kodando.react.*
import kodando.react.dom.*
import kodando.runtime.JsDate
import kotlin.browser.document
import kotlin.browser.window

fun main(args: Array<String>) {
    val container = document.querySelector("#application")!!

    val view = root {
        application {
            add("Super")
        }
    }

    render(view, container)
}

class Application : ReactPureComponent<Application.Props, Application.State>() {

    private var tickId: Int? = null

    init {
        state = State()
    }

    private fun onEverySecond(handler: () -> Unit): Int {
        return window.setInterval(handler, 1000)
    }

    override fun componentDidMount() {
        tickId = onEverySecond {
            setState(State(JsDate()))
        }
    }

    override fun render(): ReactNode? {
        return root {
            div("container") {
                card("Time Panel") {
                    onClick = {
                        console.log("Clicked!")
                    }

                    setStyle {
                        width = "20rem"
                    }

                    add(props.children)

                    p {
                        key = "time-p"
                        add("Horário: ${state.now.toLocaleTimeString()}")
                    }
                }
            }
        }
    }

    override fun componentWillUnmount() {
        tickId?.let {
            window.clearInterval(it)
        }
    }

    interface Props : ReactProps

    data class State(val now: JsDate = JsDate())

}

fun ReactProps.application(configurer: Configurer<Application.Props>) {
    addComponent(Application::class) {
        configurer()
    }
}

typealias ClickHandler = () -> Unit

external interface CardProps : ReactProps {
    var onClick: ClickHandler?
}

fun ReactProps.card(title: String, configurer: Configurer<CardProps>) {
    val props = createProps(configurer)

    div("card") {
        div("card-body") {
            h4("card-title") {
                add(title)
            }

            add(props.children)
        }

        a("btn btn-primary") {
            href = "#"
            onClick = {
                props.onClick?.invoke()
            }

            add("Go somewhere")
        }
    }
}
