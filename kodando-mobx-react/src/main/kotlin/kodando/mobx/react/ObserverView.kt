package kodando.mobx.react

import kodando.react.ReactProps
import kodando.react.SimpleView
import kodando.react.withDisplayName

abstract class ObserverView<TProps : ReactProps> : SimpleView<TProps>() {
  override val renderer = makeObserver(this::render.withDisplayName(this::class))
}
