package kodando.mithril

import kodando.runtime.unsafe.objectWithShapeOf
import org.w3c.dom.events.Event
import kotlin.js.Promise

typealias Applier<T> = T.() -> Unit

fun <T : Props> createProps(applier: Applier<T>? = null): T {
  val props = objectWithShapeOf<T>()

  if (applier != null) {
    props.applier()
  }

  return props
}

fun <T : Props> createPropsAndAlso(configure: (T) -> Unit): T {
  return createProps<T>().also(configure)
}

fun VNode<*>.addTransientAnimationClass(className: String): Promise<Unit> {
  val eventName = "animationend"

  return Promise { resolve, _ ->
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
