package kodando.runtime.es2015

import kodando.runtime.Tuple2

@JsName("Map")
external class MutableJsMap<Key, Value>(vararg tuples: Tuple2<Key, Value>) : JsMap<Key, Value> {
  fun clear()

  @JsName("delete")
  fun remove(key: Key)

  fun set(key: Key, value: Value)
}

fun <Key, Value> mutableJsMapOf(vararg tuples: Tuple2<Key, Value>) =
  MutableJsMap(*tuples)
