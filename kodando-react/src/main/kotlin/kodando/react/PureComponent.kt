@file: JsModule("react")
@file: JsNonModule

package kodando.react

@JsName("PureComponent")
abstract external class PureComponent<Props : ReactProps, State> : Component<Props, State>
