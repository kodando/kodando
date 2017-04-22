@file:Suppress("UnsafeCastFromDynamic")

package kodando.react

interface ReactChildren


@JsName("reactChildrenIsArray")
fun ReactChildren.isArray() =
    this is Array<*>


@JsName("reactChildrenIsString")
fun ReactChildren.isString() =
    jsTypeOf(this) === "string"


@JsName("reactChildrenIsNumber")
fun ReactChildren.isNumber() =
    jsTypeOf(this) === "number"


@JsName("reactChildrenIsElement")
fun ReactChildren.isElement() =
    jsTypeOf(this) === "object"


@JsName("reactChildrenToArray")
fun ReactChildren.toArray(): Array<Any?> =
    if (this.isArray())
        this.asDynamic()
    else
        arrayOf(this.asDynamic())


@JsName("reactChildrenAsString")
fun ReactChildren?.asString(): String? {
    return this.unsafeCast<String?>()
}


@JsName("reactChildrenAsNumber")
fun ReactChildren?.asNumber(): Number? {
    return this.unsafeCast<Number?>()
}


@JsName("reactChildrenAsElements")
fun ReactChildren?.asElements(): Array<ReactElement?>? {
    return this.unsafeCast<Array<ReactElement?>?>()
}


@JsName("reactChildrenAsReactElement")
fun ReactChildren?.asReactElement(): ReactElement? {
    if (this == null)
        return null

    if (this.isArray()) {
        throw OnlyOneChildIsAllowedError(this)
    }

    return this.unsafeCast<ReactElement?>()
}

class OnlyOneChildIsAllowedError(val children: ReactChildren)
    : Throwable("Too many children to return as a single child")


@JsName("concatReactChildrenWithElements")
fun ReactChildren?.concat(vararg elements: ReactElement?): ReactChildren? {
    if (this == null) {
        return all(*elements).unsafeCast<ReactChildren>()
    }

    if (this.isArray()) {
        return reactChildren((this as Array<ReactElement?>) + elements)
    }

    return reactChildren(arrayOf(this.asReactElement(), *elements))
}


@JsName("reactChildrenFromArray")
fun reactChildren(children: Array<ReactElement?>): ReactChildren? {
    if (children.size > 1) {
        return children.unsafeCast<ReactChildren>()
    }

    if (children.size == 1) {
        return children[0].unsafeCast<ReactChildren>()
    }

    return null
}

@JsName("reactChildrenFromElement")
fun reactChildren(element: ReactElement?): ReactChildren? =
    element.unsafeCast<ReactChildren?>()
