package kodando.mobx

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class ReadOnlyValueProperty<T>(private val value: T) : ReadOnlyProperty<Any, T> {
  override fun getValue(thisRef: Any, property: KProperty<*>): T {
    return value
  }
}
