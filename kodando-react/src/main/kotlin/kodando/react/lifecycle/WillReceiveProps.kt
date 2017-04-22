package kodando.react.lifecycle

external interface WillReceiveProps<TProps> {
	fun componentWillReceiveProps(nextProps: TProps)
}