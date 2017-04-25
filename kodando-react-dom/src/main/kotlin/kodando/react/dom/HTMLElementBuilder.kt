package kodando.react.dom

import kodando.react.*

open class HTMLElementBuilder<out TProps : HTMLElementAttributes>(val tagName: String) : Builder<TProps> {

    override fun build(setter: PropSetter<TProps>): ReactElement? {
        return createElement(tagName, unsafePropsBy(setter))
    }

}
