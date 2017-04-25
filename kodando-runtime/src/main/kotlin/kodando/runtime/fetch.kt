package kodando.runtime

import org.w3c.fetch.Response
import kotlin.js.*

/**
 * Created by danfma on 28/01/2017.
 */

@JsName("fetch")
external fun fetch(url: String): Promise<Response>

@JsName("fetch")
external fun fetch(url: String, request: IFetchRequestInit): Promise<Response>

external interface IFetchRequestInit {
    val method: String
    val body: Any?
    val headers: Json?
}

class FetchRequestInit(
    override val method: String,
    override val body: Any? = null,
    override val headers: Json? = undefined) : IFetchRequestInit