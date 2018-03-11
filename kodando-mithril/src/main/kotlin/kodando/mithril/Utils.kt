package kodando.mithril

import org.w3c.dom.events.Event
import kotlin.js.Promise

typealias Applier<T> = T.() -> Unit

private fun <T> createObject() =
    js("({})").unsafeCast<T>()

private fun <T> createObject(configure: (T) -> Unit): T =
    createObject<T>().also(configure)

fun <T : Props> withProps(applier: Applier<T>? = null): T {
    val props = createObject<T>()

    if (applier != null) {
        props.applier()
    }

    return props
}

fun VNode<*>.addTransientAnimationClass(className: String): Promise<Unit> {
    val eventName = "animationend"

    return Promise { resolve, reject ->
        lateinit var callback: (Event) -> Unit

        callback = {
            dom.removeEventListener(eventName, callback)
            dom.classList.remove(className)
            resolve(Unit)
        }

        dom.addEventListener(eventName, callback)
        dom.classList.add(className)
    }
}
