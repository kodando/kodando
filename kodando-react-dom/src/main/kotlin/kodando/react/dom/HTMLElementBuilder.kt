package kodando.react.dom

import kodando.react.*

open class HTMLElementBuilder<out TProps : HTMLElementAttributes>(val tagName: String) : ElementBuilder<TProps>() {

	override fun invoke(propsSetter: TProps.() -> Unit): ReactElement? {
		val (children, props) = extractChildren(emptyPropsOf(propsSetter))

		return React.createElement(tagName, props, *children)
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
