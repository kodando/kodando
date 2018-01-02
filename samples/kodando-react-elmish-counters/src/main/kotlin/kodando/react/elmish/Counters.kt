package kodando.react.elmish

import kodando.elmish.*
import kodando.elmish.react.add
import kodando.elmish.react.viewOf
import kodando.react.add
import kodando.react.dom.button
import kodando.react.dom.div
import kotlin.browser.window

object Counters : Component<Array<Int>, Counters.Message> {

    sealed class Message {
        class AddCounter : Message()
        class AddCounterLater(val delay: Int) : Message()
        class ToCounter(val index: Int, val message: Counter.Message) : Message()
    }

    override fun update(model: Array<Int>, message: Message): Result<Array<Int>, Message> {
        return when (message) {
            is Message.AddCounter ->
                Result(model.addCounter())

            is Message.AddCounterLater ->
                Result(model, addCounterLater(message.delay))

            is Message.ToCounter ->
                Result(model.toCounter(message))
        }
    }

    override fun render(model: Array<Int>, dispatch: Dispatch<Message>): View {
        return viewOf(model) {
            div("counters-view") {
                button {
                    type = "button"
                    add("Add counter")
                }

                div("items") {
                    for ((index, counter) in model.withIndex()) {
                        add(Counter.render(counter, wrapAndDispatchToCounter(index, dispatch)))
                    }
                }
            }
        }
    }

    private fun wrapAndDispatchToCounter(counterIndex: Int, dispatch: Dispatch<Message>): Dispatch<Counter.Message> = { message ->
        dispatch(Message.ToCounter(counterIndex, message))
    }

}

private fun Array<Int>.addCounter(): Array<Int> {
    return this + 0
}

private fun Array<Int>.toCounter(message: Counters.Message.ToCounter): Array<Int> {
    val clone = arrayOf(*this)
    val (newItem, _) = Counter.update(clone[message.index], message.message)

    clone[message.index] = newItem

    return clone
}

private fun addCounterLater(delay: Int): Command<Counters.Message> = { dispatch ->
    window.setTimeout({ dispatch(Counters.Message.AddCounter()) }, delay)
}
