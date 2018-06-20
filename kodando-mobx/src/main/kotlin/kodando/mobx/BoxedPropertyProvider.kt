package kodando.mobx

import kotlin.js.json
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BoxedPropertyProvider<T>(private val value: T) {
  operator fun provideDelegate(thisRef: Any, property: KProperty<*>): ReadWriteProperty<Any, T> {
    val options = json("deep" to false, "name" to property.name)
    val box = Mobx.Observable.box(value, options)

    return BoxedProperty(box)
  }
}

