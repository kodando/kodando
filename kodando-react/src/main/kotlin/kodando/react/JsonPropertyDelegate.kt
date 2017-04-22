package kodando.react

import kotlin.js.Json
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class JsonPropertyDelegate(val json: Json, val customProperty: String? = null) : ReadWriteProperty<ReactProps, dynamic> {
    override fun getValue(thisRef: ReactProps, property: KProperty<*>): dynamic {
        return json[customProperty ?: property.name]
    }

    override fun setValue(thisRef: ReactProps, property: KProperty<*>, value: dynamic) {
        json[customProperty ?: property.name] = value
    }
}
