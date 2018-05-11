package kodando.react.router.dom

import kodando.react.Configurer
import kodando.react.ReactProps
import kodando.react.addComponent
import kodando.react.createProps

/**
 * Created by danfma on 04/04/17.
 */

private inline fun ReactProps.redirect(configurer: Configurer<RedirectProps>) {
  addComponent(Module.RedirectClass, createProps(configurer))
}


@JsName("redirectToUrl")
fun ReactProps.redirect(to: String, from: String? = null, push: Boolean? = null) {
  redirect {
    this.toUrl = to
    this.from = from ?: undefined
    this.push = push ?: undefined
  }
}


@JsName("redirectToLocation")
fun ReactProps.redirect(location: Location, from: String? = null, push: Boolean? = null) {
  redirect {
    this.toLocation = location
    this.from = from ?: undefined
    this.push = push ?: undefined
  }
}
