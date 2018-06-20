package kodando.react

typealias Configurer<T> = T.() -> Unit

@JsName("unsafelyCreateObject")
inline fun <T> unsafelyCreateObject() =
  js("({})").unsafeCast<T>()

@JsName("createProps")
inline fun <T : ReactProps> createProps(): T =
  unsafelyCreateObject()

@JsName("createPropsAndConfigure")
inline fun <T : ReactProps> createProps(configure: Configurer<T>): T =
  createProps<T>().also(configure)

@JsName("configureBy")
fun <T : ReactProps> T.configureBy(configure: Configurer<T>?): T {
  if (configure != null) {
    this.configure()
  }

  return this
}

fun ReactProps.copy(other: ReactProps, ignore: Array<String>) {
  keysOf(other)
    .filterNot { ignore.contains(it) }
    .forEach { key ->
      this[key] = other[key]
    }
}

private inline fun keysOf(some: Any): Array<String> =
  js("Object.keys(some)").unsafeCast<Array<String>>()

