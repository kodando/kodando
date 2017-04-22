@file:Suppress("UnsafeCastFromDynamic")

package kodando.react

import kotlin.js.Json


open class ReactProps(val json: Json = kotlin.js.json()) : Json by json {
    val jsonProperty = JsonPropertyDelegate(json)

    var key: String? by jsonProperty
    var ref: String? by jsonProperty
    var refBy: ElementReferenceHandler? by jsonProperty("ref")
    var children: ReactChildren? by jsonProperty

    /**
     * Add an element child to this props.
     */
    fun addChild(child: ReactElement?) {
        children = children?.concat(child) ?: reactChildren(child)
    }

    /**
     * Copy all properties to another props instance.
     */
    fun spreadTo(other: ReactProps, except: Array<String> = arrayOf()) {
        val json = this.json
        val otherJson = other.json

        js("""
        for (var key in json) {
            if (except.indexOf(key) >= 0)
                continue;

            otherJson[key] = json[key];
        }
        """)
    }

    /**
     * Create a delegate that will map the value to the specified field (name),
     * in the json, instead of mapping to the property name.
     *
     * @param fieldName the field name
     */
    protected fun jsonProperty(fieldName: String) = JsonPropertyDelegate(json, fieldName)


    operator fun ReactElement?.unaryPlus() {
        addChild(this)
    }

    operator fun String?.unaryPlus() {
        addChild(text(this))
    }

    operator fun Array<ReactElement?>?.unaryPlus() {
        if (this == null) {
            addChild(null)
        } else {
            addChild(all(*this))
        }
    }

}
