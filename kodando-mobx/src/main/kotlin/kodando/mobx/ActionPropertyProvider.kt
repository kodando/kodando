package kodando.mobx

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class ActionPropertyProvider<TFunction : Function<R>, R>(private val action: TFunction) {
  operator fun provideDelegate(thisRef: Any, property: KProperty<*>): ReadOnlyProperty<Any, TFunction> {
    val actionName = ActionId.create(thisRef::class, property)
    val action: TFunction = Mobx.action(actionName, this.action)

    return ReadOnlyValueProperty(action)
  }
}
