package kodando.runtime.es2015

import kodando.runtime.Tuple2

@JsName("WeakMap")
open external class WeakMap<Key, Value>(vararg tuple2: Tuple2<Key, Value>) {
  fun get(key: Key): Value?

  fun has(key: Key): Boolean

  fun set(key: Key, value: Value)

  fun delete(key: Key): Array<Value>

  fun clear(): Unit
}
