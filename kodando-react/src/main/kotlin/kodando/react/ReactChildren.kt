@file:Suppress("UnsafeCastFromDynamic")

package kodando.react

interface ReactChildren

fun ReactChildren.isArray() =
	this is Array<*>

fun ReactChildren.hasSingleElement() =
	this.asDynamic().length === 1

fun ReactChildren.isString() =
	jsTypeOf(this) === "string"

fun ReactChildren.isNumber() =
	jsTypeOf(this) === "number"

fun ReactChildren.isElement() =
	jsTypeOf(this) === "object"

fun ReactChildren.toArray(): Array<Any?> =
	if (this.isArray())
		this.asDynamic()
	else
		arrayOf(this.asDynamic())

fun asReactChildren(data: Array<Any?>): ReactChildren = data.asDynamic()
