@file:Suppress("UNUSED_PARAMETER")

package kodando.es6

import kotlin.js.Json
import kotlin.js.json

/**
 * Created by danfma on 16/01/2017.
 */

fun ensure(vararg data: Any) {
    // nothing
}

@Suppress("UnsafeCastFromDynamic")
fun cloneJson(json: Json): Json = js("(Object.assign({}, json))")

fun cloneJsonWith(data: Json?, vararg newEntries: Pair<String, Any?>): Json {
    val result = if (data == null) json() else cloneJson(data)

    for (entry in newEntries) {
        result.asDynamic()[entry.first] = entry.second
    }

    return result
}
