package kodando.mithril.context

import kodando.mithril.*
import kodando.runtime.es2015.Symbol

external interface ContextProviderProps : Props {
  var name: Symbol
  var value: Any?
  var renderer: () -> VNode<*>?
}

object ContextProvider
  : View<ContextProviderProps>
  , OnRemove<ContextProviderProps> {

  override fun onRemove(vnode: VNode<ContextProviderProps>) {
    val attrs = vnode.attrs!!
    val key = attrs.name

    SharedContextMap.remove(key)
  }

  override fun view(vnode: VNode<ContextProviderProps>): VNode<*>? {
    val attrs = vnode.attrs ?: throw Error("You should specify the name and value")
    val key = attrs.name
    val value = attrs.value

    SharedContextMap.put(key, value)

    return vnode.attrs?.renderer?.invoke()
  }
}

fun <T> Props.contextProvider(key: ContextKey<T>, contextValue: T, applier: Applier<Props>) {
  addChild(ContextProvider) {
    name = key.name
    value = contextValue
    renderer = {
      root(applier)
    }
  }
}
