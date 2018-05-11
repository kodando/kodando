package kodando.mithril.context

import kodando.runtime.es2015.Symbol

internal object SharedContextMap {
  private var contextMap = mutableMapOf<Symbol, MutableList<Any>>()

  fun put(key: Symbol, value: Any) {
    contextMap
      .getOrPut(key) { mutableListOf() }
      .add(value)
  }

  fun get(key: Symbol): Any {
    return contextMap[key]?.last() ?: throw Error("No context value for contextKey = '$key'")
  }

  fun remove(key: Symbol) {
    val values = contextMap.getValue(key)

    values.removeAt(values.size - 1)

    if (values.size == 0) {
      contextMap.remove(key)
    }
  }

}