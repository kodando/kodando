@file: JsModule("react")
@file: JsNonModule

package kodando.react

external abstract class Component<out Props : ReactProps, State> {
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
    abstract fun render(): ReactElement?
}
