@file: JsModule("react")
@file: JsNonModule

package kodando.react

@JsName("PureComponent")
external abstract class PureComponent<Props : ReactProps, State> : Component<Props, State>
