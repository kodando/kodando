package kodando.mobx

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BoxedProperty<T>(private val box: Mobx.ObservableValue<T>) : ReadWriteProperty<Any, T> {
  override fun getValue(thisRef: Any, property: KProperty<*>): T {
    return box.get()
  }

  override fun setValue(thisRef: Any, property: KProperty<*>, value: T) {
    box.set(value)
  }
}