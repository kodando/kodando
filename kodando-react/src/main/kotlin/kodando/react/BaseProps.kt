package kodando.react

/**
 * Created by danfma on 16/01/2017.
 */

open class BaseProps : ReactProps {
    override fun get(propertyName: String): Any? {
        return this.asDynamic()[propertyName]
    }

    override fun set(propertyName: String, value: Any?) {
        this.asDynamic()[propertyName] = value
    }
}
