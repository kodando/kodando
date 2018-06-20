package kodando.mobx

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class BoxedComputedProperty<T>(private val box: Mobx.ReadableValue<T>) : ReadOnlyProperty<Any, T> {
  override fun getValue(thisRef: Any, property: KProperty<*>): T {
    return box.get()
  }
}
