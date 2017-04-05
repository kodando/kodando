package kodando.react

/**
 * Created by danfma on 19/01/17.
 */

typealias PropSetter<T> = T.() -> Unit

fun <T> propsBy(propSetter: PropSetter<T>): T = objectOf(propSetter)
