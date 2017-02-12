package kodando.es6

/**
 * Created by danfma on 15/01/2017.
 */

typealias ResolveHandler<T> = (T) -> Unit
typealias RejectHandler = (Any) -> Unit

external class Promise<T>(builder: (ResolveHandler<T>, RejectHandler) -> Unit) {

	@JsName("then")
	fun <TResult> then(transformer: (T) -> TResult): Promise<TResult>

	@JsName("then")
	fun <TResult> thenAwait(transformer: (T) -> Promise<TResult>): Promise<TResult>

	@JsName("catch")
	fun catch(handler: (Error) -> T): Promise<T>

	@JsName("catch")
	fun <TResult> catchAndMap(handler: (Error) -> TResult): Promise<TResult>

	companion object {
		fun <T> resolve(value: T): Promise<T>
	}

}
