@file: JsModule("react")
@file: JsNonModule

package kodando.react

external abstract class Component<out Props, State> {
    val props: Props
    var state: State
    val refs: ElementRefs

    @JsName("setState")
    protected fun setState(state: State): Unit

    @JsName("setState")
    protected fun setState(state: State, callback: () -> Unit): Unit

    @JsName("forceUpdate")
    fun forceUpdate(): Unit

    @JsName("render")
    abstract fun render(): ReactElement?;
}

external abstract class PureComponent<Props, State> : Component<Props, State>, ShouldUpdate<Props, State> {
    override fun shouldComponentUpdate(nextProps: Props, nextState: State): Boolean
}