package kodando.react

import kotlin.reflect.KClass

private val noChildren = arrayOf<Any?>()

private inline fun asReactChildren(child: Any?) =
  child.unsafeCast<ReactChildren?>()


@JsName("addChild")
fun addChild(target: ReactProps, child: Any?) {
  val children = target.children

  when (children) {
    undefined -> target.children = asReactChildren(child)
    is Array<*> -> target.children = asReactChildren(children + child)
    else -> target.children = asReactChildren(arrayOf(children, child))
  }
}

internal fun popChildrenFrom(props: ReactProps): Array<Any?> {
  val children = props.children

  js("delete props.children")

  return when (children) {
    undefined -> noChildren
    is Array<*> -> children.unsafeCast<Array<Any?>>()
    else -> arrayOf(children)
  }
}

@JsName("firstChild")
fun ReactProps.firstChild(): ReactNode? {
  val children = children

  return when (children) {
    undefined, null -> null
    is Array<*> -> children.firstOrNull().unsafeCast<ReactNode?>()
    else -> children.unsafeCast<ReactNode?>()
  }
}

@JsName("addNode")
fun ReactProps.add(child: ReactNode?) {
  addChild(this, child)
}

@JsName("addText")
fun ReactProps.add(text: String) {
  addChild(this, text)
}

@JsName("addNumber")
fun ReactProps.add(number: Number) {
  addChild(this, number)
}

@JsName("addNodes")
fun ReactProps.add(children: Array<out ReactNode?>) {
  addChild(this, children)
}

@JsName("addChildren")
fun ReactProps.add(children: ReactChildren?) {
  addChild(this, children)
}

@JsName("addView")
fun <TProps : ReactProps> ReactProps.addView(
  renderer: SimpleView<TProps>,
  configurer: Configurer<TProps>? = null) {

  add(
    renderer(createProps<TProps> {
      configurer?.invoke(this)
    })
  )
}

@JsName("addComponent")
fun <TProps : ReactProps> ReactProps.addComponent(
  componentType: JsClass<out Component<TProps, *>>,
  props: TProps = createProps(),
  configure: Configurer<TProps>? = null) {

  if (configure != null) {
    props.configure()
  }

  addChild(this, createComponent(componentType, props))
}

@JsName("addKComponent")
fun <TProps : ReactProps> ReactProps.addComponent(
  componentType: KClass<out Component<TProps, *>>,
  props: TProps = createProps(),
  configure: Configurer<TProps>? = null) {

  addComponent(componentType.js, props, configure)
}
