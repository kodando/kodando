package kodando.react.lifecycle

/**
 * Invoked immediately after the component's updates are flushed to the DOM. This method is not called for the initial render.
 * Use this as an opportunity to operate on the DOM when the component has been updated.
 */
external interface DidUpdate<in TProps, in TState> {
	fun componentDidUpdate(prevProps: TProps, prevState: TState)
}