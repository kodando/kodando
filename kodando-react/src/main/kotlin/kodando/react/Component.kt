@file: JsModule("react")
@file: JsNonModule

package kodando.react

@JsName("Component")
abstract external class Component<TProps : ReactProps, TState>(props: TProps = definedExternally, context: Any? = definedExternally) {
  val props: TProps
  var state: TState
  open val context: Any?

  fun forceUpdate()

  @JsName("setState")
  fun setState(state: TState, callback: (() -> Unit)? = definedExternally)

  @JsName("setState")
  fun setState(updater: (TState, TProps) -> TState)

  open fun componentWillMount()

  open fun componentDidMount()

  open fun componentWillReceiveProps(nextProps: TProps)

  open fun shouldComponentUpdate(nextProps: TProps, nextState: TState): Boolean

  open fun componentWillUpdate(nextProps: TProps, nextState: TState)

  @JsName("render")
  abstract fun render(): ReactNode?

  open fun componentDidUpdate(prevProps: TProps, prevState: TState)

  open fun componentWillUnmount()

  open fun componentDidCatch(error: Throwable, info: Any?)

}
