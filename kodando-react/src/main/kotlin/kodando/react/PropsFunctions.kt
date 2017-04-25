@file:Suppress("UnsafeCastFromDynamic")

package kodando.react

import kodando.runtime.unsafe.objectWithShapeOf


/**
 * Creates an unsafe dynamic instance instance of an object that implements a ReactProps with the shape of the
 * {T}. Remember that this object will have the Shape of T (at runtime), but its time won't be of the type T.
 *
 * Prefer the propsBy or propSetterOf functions.
 */
fun <T : ReactProps> unsafePropsOf(): T {
    return objectWithShapeOf()
}

/**
 * Creates an unsafe dynamic instance of a ReactProps and populates it.
 *
 * @see unsafePropsOf()
 */
fun <T : ReactProps> unsafePropsBy(setter: PropSetter<T>): T {
    return unsafePropsOf<T>().apply(setter)
}


/**
 * Creates a props by using the specified factory and then populates it with the setter specified, returning the
 * props fulfilled.
 */
@JsName("propsBy")
fun <T : ReactProps> propsBy(factory: () -> T, setter: PropSetter<T>): T =
    factory().apply { this.setter() }


/**
 * Creates and returns a props setter function that will use the specified factory to create the props instance.
 */
@JsName("propSetterOf")
fun <T : ReactProps> propSetterOf(factory: () -> T) = { setter: PropSetter<T> ->
    factory().apply(setter)
}


/**
 * Creates and returns a props setter function that will use the extended factory to create the props instance.
 */
@JsName("toPropSetter")
fun <T : ReactProps> (() -> T).toPropSetter() = { setter: PropSetter<T> ->
    this.invoke().apply(setter)
}

