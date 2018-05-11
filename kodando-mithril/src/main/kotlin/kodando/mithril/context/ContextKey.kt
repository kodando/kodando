package kodando.mithril.context

import kodando.runtime.es2015.Symbol

data class ContextKey<T>(val name: Symbol) {
  constructor(name: String) : this(Symbol(name))
}
