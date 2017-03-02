@file:Suppress("unused", "NOTHING_TO_INLINE", "UnsafeCastFromDynamic", "UNUSED_PARAMETER")

package kodando.react

import kotlin.reflect.KProperty

fun <TProps : ReactProps> extractChildren(props: TProps): Pair<Array<Any?>, TProps> {
	val children = props.children ?: return arrayOf<Any?>() to props

	val property = props::children
	deleteFrom(props, property)

	return children.toArray() to props
}


internal fun deleteFrom(props: ReactProps, property: KProperty<*>): Unit {
	js("(delete props[property.name])")
}


internal fun childrenAsElement(children: ReactChildren?): ReactElement? =
	if (children == null) {
		null
	} else if (children is Array<*>) {
		raw(children[0])
	} else {
		raw(children)
	}

@Suppress("UNUSED_PARAMETER")
fun raw(something: Any?): ReactElement? = something.asDynamic()
