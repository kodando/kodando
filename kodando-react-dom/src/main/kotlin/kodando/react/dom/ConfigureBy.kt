package kodando.react.dom

import kodando.react.Configurer


@JsName("configureByWithClass")
fun <T : HtmlNodeProps<*>> T.configureBy(className: String, configure: Configurer<T>?): T {
  if (className.isNotEmpty()) {
    this.className = className
  }

  if (configure != null) {
    this.configure()
  }

  return this
}
