package kodando.es6

/**
 * Created by danfma on 29/01/2017.
 */

@JsName("Map")
external open class JsMap<Key, Value>(vararg tuple2: Tuple2<Key, Value>) {
    val size: Int

    fun entries(): Array<Tuple2<Key, Value>>

    fun forEach(callback: (Tuple2<Key, Value>) -> Unit)

    fun get(key: Key): Value?

    fun has(key: Key): Boolean

    fun keys(): Array<Key>

    fun values(): Array<Value>

}

fun <Key, Value> jsMapOf(vararg tuples: Tuple2<Key, Value>) =
    JsMap(*tuples)
