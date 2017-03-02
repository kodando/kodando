package kodando.react.dom

import kodando.react.ElementBuilder
import kodando.react.PropSetter
import kodando.react.ReactElement
import kodando.react.objectOf

/**
 * Created by danfma on 19/01/17.
 */

operator fun <TProps : HTMLElementAttributes> ElementBuilder<TProps>.invoke(className: String): ReactElement? =
    this.invoke {
        this.className = className
    }

operator fun <TProps : HTMLElementAttributes> ElementBuilder<TProps>.invoke(className: String, propSetter: PropSetter<TProps>): ReactElement? =
    this.invoke {
        this.className = className
        this.propSetter()
    }

fun styleOf(setter: CSSProperties.() -> Unit): CSSProperties {
    return objectOf(setter)
}
