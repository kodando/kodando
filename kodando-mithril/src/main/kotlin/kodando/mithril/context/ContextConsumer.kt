package kodando.mithril.context

import kodando.mithril.*
import kodando.runtime.es2015.Symbol

interface ContextConsumerProps : Props {
  var contextKey: Symbol
  var renderer: (Any) -> VNode<*>?
}

object ContextConsumer : View<ContextConsumerProps> {
  override fun view(vnode: VNode<ContextConsumerProps>): VNode<*>? {
    val attrs = vnode.attrs ?: throw Error("You should specify the contextKey and renderer attributes")
    val key = attrs.contextKey
    val renderer = attrs.renderer
    val contextValue = SharedContextMap.get(key)

    return renderer(contextValue)
  }
}

fun <T : Any> Props.contextConsumer(contextKey: ContextKey<T>, applier: Props.(T) -> Unit) {
  addChild(ContextConsumer) {
    this.contextKey = contextKey.name
    this.renderer = { value ->
      root {
        applier(value as T)
      }
    }
  }
}
