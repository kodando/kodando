package kodando.react

/**
 * Created by danfma on 19/01/17.
 */

object ksx : ElementBuilder<ReactProps>() {
	override operator fun invoke(propsSetter: ReactProps.() -> Unit): ReactElement? {
		val props = emptyPropsOf(propsSetter)
		val children = props.children

		return childrenAsElement(children)
	}
}
