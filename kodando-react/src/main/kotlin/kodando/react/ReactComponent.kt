@file: JsModule("react")
@file: JsNonModule

package kodando.react

@JsName("Component")
external abstract class ReactComponent<TProps : ReactProps, TState>(props: TProps = definedExternally, context: Any? = definedExternally) {

    val props: TProps
    open val context: Any?
    var state: TState

    @JsName("setState")
    fun setState(state: TState)

    @JsName("setState")
    fun setState(state: TState, callback: () -> Unit)

    open fun componentWillMount()

    open fun componentDidMount()

    open fun componentWillReceiveProps(nextProps: TProps)

    open fun shouldComponentUpdate(nextProps: TProps, nextState: TState): Boolean

    open fun componentWillUpdate(nextProps: TProps)

    open fun componentDidUpdate(previousProps: TProps, previousState: TState)

    open fun componentWillUnmount()

    abstract fun render(): ReactNode?

}
