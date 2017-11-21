package kodando.react

external interface Ref

val Ref.isString get() = jsTypeOf(this) == "string"

val Ref.isCallback get() = jsTypeOf(this) == "function"

fun refByName(name: String) = name.unsafeCast<Ref>()

fun refByCallback(callback: (Any) -> Unit) = callback.unsafeCast<Ref>()
