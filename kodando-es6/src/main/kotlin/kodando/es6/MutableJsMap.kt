package kodando.es6

@JsName("Map")
external class MutableJsMap<Key, Value>(vararg tuples: Tuple2<Key, Value>) : JsMap<Key, Value> {
	fun clear()

	@JsName("delete")
	fun remove(key: Key)

	fun set(key: Key, value: Value)
}

fun <Key, Value> mutableMapOf(vararg tuples: Tuple2<Key, Value>) =
	MutableJsMap(*tuples)
