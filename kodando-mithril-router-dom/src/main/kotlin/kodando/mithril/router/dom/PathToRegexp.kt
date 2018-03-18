package kodando.mithril.routing

import kotlin.js.RegExp

class PathToRegExpOptions(
    val sensitive: Boolean,
    val strict: Boolean,
    val end: Boolean
)

@JsModule("path-to-regexp")
external fun pathToRegExp(
    path: String,
    keys: Array<String> = definedExternally,
    options: PathToRegExpOptions = definedExternally
): RegExp
