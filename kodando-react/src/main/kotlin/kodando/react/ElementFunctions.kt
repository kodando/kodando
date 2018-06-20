package kodando.react

@JsName("createElement")
fun createElement(tagName: String, props: ReactProps): ReactNode? {
  return React.createElement(tagName, props, *popChildrenFrom(props))
}

@JsName("createElementByRenderer")
fun <TProps : ReactProps> createElement(renderer: (TProps) -> ReactNode?, props: TProps): ReactNode? {
  return React.createElement(renderer, props, *popChildrenFrom(props))
}

@JsName("createComponent")
fun <TProps : ReactProps> createComponent(componentType: JsClass<out Component<TProps, *>>, props: TProps): ReactNode? {
  return React.createElement(componentType, props, *popChildrenFrom(props))
}
