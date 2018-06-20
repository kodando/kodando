package kodando.react

@JsName("root")
fun root(configure: Configurer<ReactProps>): ReactNode? {
  return createProps<ReactProps>()
    .apply(configure)
    .firstChild()
}
