@file: JsModule("react")
@file: JsNonModule

package kodando.react

@JsName("PureComponent")
external abstract class ReactPureComponent<Props : ReactProps, State> : ReactComponent<Props, State>
