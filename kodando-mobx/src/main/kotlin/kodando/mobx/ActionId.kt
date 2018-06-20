package kodando.mobx

import kotlin.reflect.KClass
import kotlin.reflect.KProperty

internal object ActionId {
  private var nextId = 1

  fun next(name: String): String {
    return "$name@${nextId++}"
  }

  fun create(type: KClass<*>, property: KProperty<*>): String {
    return ActionId.next("${type.simpleName}::${property.name}")
  }
}