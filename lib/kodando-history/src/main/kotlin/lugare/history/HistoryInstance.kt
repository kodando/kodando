package lugare.history

external interface HistoryInstance {
	val location: Location
	val length: Int
	val action: Any

	fun listen(handler: (Location, Any) -> Unit): () -> Unit
	fun push(path: String)
	fun replace(path: String)
	fun go(steps: Int)
	fun goBack()
	fun goForward()

	fun block(message: String): () -> Unit
	fun block(handler: (Location, Any) -> String?)
}
