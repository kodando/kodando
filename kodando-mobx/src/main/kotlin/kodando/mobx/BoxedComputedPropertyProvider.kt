package kodando.mobx

import kotlin.js.json
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class BoxedComputedPropertyProvider<T>(private val getter: () -> T) {
  operator fun provideDelegate(thisRef: Any, property: KProperty<*>): ReadOnlyProperty<Any, T> {
    val options = json("name" to property.name)
    val box = Mobx.computed(getter, options)

    return BoxedComputedProperty(box)
  }
}

