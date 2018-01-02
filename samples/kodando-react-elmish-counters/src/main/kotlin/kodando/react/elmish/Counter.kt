package kodando.react.elmish

import kodando.elmish.Component
import kodando.elmish.Dispatch
import kodando.elmish.Result
import kodando.elmish.View
import kodando.elmish.react.viewOf
import kodando.react.add
import kodando.react.dom.button
import kodando.react.dom.div
import kodando.react.dom.span


object Counter : Component<Int, Counter.Message> {

    sealed class Message {
        class Increment : Message()
        class Decrement : Message()
    }

    override fun update(model: Int, message: Message): Result<Int, Message> {
        return Result(
            when (message) {
                is Message.Increment -> model + 1
                is Message.Decrement -> model - 1
            }
        )
    }

    override fun render(model: Int, dispatch: Dispatch<Message>): View {
        return viewOf(model) {
            div("counter-view") {
                button {
                    type = "button"
                    add("-")
                }

                span("display") {
                    add(model)
                }

                button {
                    type = "button"
                    add("+")
                }
            }
        }
    }

}
