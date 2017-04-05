@file:Suppress("UnsafeCastFromDynamic")

package kodando.react

import org.w3c.dom.Element
import kotlin.js.Json

interface ReactProps : Json {

    operator fun ReactElement?.unaryPlus() {
        append(this)
    }

    operator fun String?.unaryPlus() {
        append(this)
    }

    operator fun ReactChildren?.unaryPlus() {
        append(this)
    }

}

inline var ReactProps.key: String?
    get() = this.asDynamic().key
    set(value) {
        this.asDynamic().key = value
    }


inline var ReactProps.ref: String?
    get() = this.asDynamic().ref
    set(value) {
        this.asDynamic().ref = value
    }

var ReactProps.refBy: (Element) -> Unit
    get() = this.asDynamic().ref
    set(value) {
        this.asDynamic().ref = value
    }

inline var ReactProps.children: ReactChildren?
    get() = this.asDynamic().children
    set(value) {
        this.asDynamic().children = value
    }

