package kodando.react.dom

import kodando.react.PropSetter
import kodando.react.ReactElement
import kodando.react.createElement

open class HTMLElementBuilder<out TProps : HTMLElementAttributes>(
    val tagName: String,
    val propsFactory: () -> TProps) {

    operator open fun invoke(propsSetter: PropSetter<TProps>): ReactElement? {
        return createElement(tagName, propsFactory().apply(propsSetter))
    }

    operator fun invoke(className: String): ReactElement? =
        this.invoke {
            this.className = className
        }

    operator fun invoke(className: String, propSetter: PropSetter<TProps>): ReactElement? =
        this.invoke {
            this.className = className
            this.propSetter()
        }

}
