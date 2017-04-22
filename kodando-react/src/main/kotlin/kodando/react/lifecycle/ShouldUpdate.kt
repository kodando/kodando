package kodando.react.lifecycle

external interface ShouldUpdate<in TProps, in TState> {
	fun shouldComponentUpdate(nextProps: TProps, nextState: TState): Boolean
}