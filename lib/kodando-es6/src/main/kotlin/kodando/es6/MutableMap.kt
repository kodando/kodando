package kodando.es6

@JsName("Map")
external class MutableMap<Key, Value>(vararg tuples: Tuple2<Key, Value>) : Map<Key, Value> {
	fun clear()

	@JsName("delete")
	fun remove(key: Key)

	fun set(key: Key, value: Value)
}

fun <Key, Value> mutableMapOf(vararg tuples: Tuple2<Key, Value>) =
	MutableMap(*tuples)
