@file:Suppress("UnsafeCastFromDynamic", "NOTHING_TO_INLINE")

package kodando.runtime

/**
 * Created by danfma on 16/01/2017.
 */

@JsName("Array")
external class JsArray<T>() {
    constructor(size: Int)
    constructor(vararg elements: T)

    val length: Int
    fun push(vararg values: T): Unit
    fun slice(index: Int, count: Int): JsArray<T>
    fun splice(index: Int, count: Int, vararg newItems: T): JsArray<T>
    fun forEach(handler: (T, Int) -> Unit): Unit
    fun join(glue: String): String
}

inline fun <T> mutableJsArrayOf(vararg args: T) = JsArray(*args)

inline operator fun <T> JsArray<T>.get(key: Int): T = this.asDynamic()[key]

inline operator fun <T> JsArray<T>.set(key: Int, value: T) {
    this.asDynamic()[key] = value
}

fun <T> jsArrayOf(vararg data: T): JsArray<T> {
    val target = JsArray<T>(data.size)

    for (i in 0..data.size) {
        target[i] = data[i]
    }

    return target
}

fun <T, R> JsArray<T>.flatMap(extractor: (T) -> JsArray<R>): JsArray<R> {
    val result = jsArrayOf<R>()

    for (item in this) {
        val extractedItems = extractor(item)

        for (extractedItem in extractedItems) {
            result.push(extractedItem)
        }
    }

    return result
}

private operator fun <T> JsArray<T>.iterator(): Iterator<T> {
    return ArrayIterator(this)
}

class ArrayIterator<T>(val target: JsArray<T>) : Iterator<T> {
    private var currentPos = -1

    override fun hasNext(): Boolean {
        return currentPos < target.length - 1
    }

    override fun next(): T {
        val pos = ++currentPos

        return target[pos]
    }

}
