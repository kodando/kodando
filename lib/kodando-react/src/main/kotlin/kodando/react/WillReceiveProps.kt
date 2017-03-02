package kodando.react

external interface WillReceiveProps<TProps> {
	fun componentWillReceiveProps(nextProps: TProps)
}