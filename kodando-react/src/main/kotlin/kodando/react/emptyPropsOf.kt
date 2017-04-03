@file:Suppress("UnsafeCastFromDynamic")

package kodando.react

/**
 * Created by danfma on 16/01/2017.
 */

class EmptyProps : ReactProps

fun <T> objectOf(): T = js("({})")

fun <T> objectOf(setter: T.() -> Unit): T {
	val obj = objectOf<T>()
	obj.setter()
	return obj
}

fun <T : ReactProps> emptyPropsOf(): T {
	return EmptyProps().asDynamic()
}

fun <T : ReactProps> emptyPropsOf(populator: T.() -> Unit): T {
	return emptyPropsOf<T>().apply(populator)
}
