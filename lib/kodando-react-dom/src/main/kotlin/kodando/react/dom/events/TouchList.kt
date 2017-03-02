package kodando.react.dom.events

import org.w3c.dom.Touch

external interface TouchList {
    val length: Int
    fun item(index: Int): Touch?
    operator fun get(index: Int): Touch?
}