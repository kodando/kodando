@file:Suppress("UnsafeCastFromDynamic", "unused", "UNUSED_PARAMETER", "UNUSED_VARIABLE")

package kodando.react

fun <T : Component<*, *>> React.createElement(factory: JsClass<T>, props: ReactProps?, vararg children: Any?): TypedReactElement<T> {
	return this.createElement(factory, props, *children)
}

fun ReactProps.append(children: Any?) {
	var currentChildren = this.children?.toArray() ?: arrayOf()

	currentChildren += children
	this.children = asReactChildren(currentChildren)
}

val ReactProps.addText: (() -> String?) -> Unit
	get() = { text ->
		append(raw(text()))
	}

fun ReactProps.addText(text: String?) {
	append(raw(text))
}

fun <T : ReactProps> T.spread(other: T, except: Array<String>? = null) {
	val self = this

	js("""
		var exception = (except || []).reduce(function(acc, x) {
			acc[x] = true;
			return acc;
		}, {});

		for (var key in other) {
			if (exception[key]) {
				continue;
			}

            self[key] = other[key];
        }
    """)
}
