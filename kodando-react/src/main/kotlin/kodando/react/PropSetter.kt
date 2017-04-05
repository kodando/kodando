package kodando.react

/**
 * Created by danfma on 19/01/17.
 */

typealias PropSetter<T> = T.() -> Unit

@JsName("propsBy")
fun <T : ReactProps> propsBy(propSetter: PropSetter<T>): T = emptyPropsOf(propSetter)
