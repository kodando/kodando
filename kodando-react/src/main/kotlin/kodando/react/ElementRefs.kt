package kodando.react

import org.w3c.dom.Element

external interface ElementRefs {
    operator fun get(key: String): Element?
}
