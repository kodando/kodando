package kodando.react

import kodando.react.lifecycle.ShouldUpdate

external abstract class PureComponent<Props : ReactProps, State> : Component<Props, State>, ShouldUpdate<Props, State> {
    override fun shouldComponentUpdate(nextProps: Props, nextState: State): Boolean
}
