package kodando.react

external interface ShouldUpdate<in TProps, in TState> {
	fun shouldComponentUpdate(nextProps: TProps, nextState: TState): Boolean
}