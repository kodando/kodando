package kodando.react

/**
 * Invoked immediately before rendering when new props or state are being received. This method is not called for the initial render.
 * Use this as an opportunity to perform preparation before an update occurs.
 *
 * @note You cannot use this.setState() in this method. If you need to update state in response to a prop change, use componentWillReceiveProps instead.
 */
external interface WillUpdate<in TProps, in TState> {
	fun componentWillUpdate(nextProps: TProps, nextState: TState)
}