package kodando.es6

import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KProperty

/**
 * Created by danfma on 16/01/2017.
 */


class Metadata<T : Any>(val type: JsClass<T>) {
	constructor(clazz: KClass<T>) : this(clazz.js)

	fun <TProperty> decorateProperty(
            property: KProperty<TProperty>,
            vararg decorators: PropertyDecorator) {

		val prototype = type.asDynamic().prototype
		val propertyName = property.name
		val propertyDescriptor = getOwnPropertyDescriptor(prototype, propertyName)

		decorate(decorators, prototype, propertyName, propertyDescriptor ?: undefined)
	}

	fun decorateMethod(
		memberName: String,
		vararg decorators: MethodDecorator) {

		val prototype = type.asDynamic().prototype
		val propertyName = memberName
		val propertyDescriptor = getOwnPropertyDescriptor(prototype, propertyName)

		decorate(decorators, prototype, propertyName, propertyDescriptor ?: undefined)
	}

	companion object {
		private val getOwnPropertyDescriptor: dynamic = js("Object.getOwnPropertyDescriptor")

		private val decorate: dynamic = js("""
(function (decorators, target, key, desc) {
    var previousDescriptor = (desc && !desc.configurable) ? desc : null;
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;

    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;

	if (previousDescriptor) {
		if (c > 3 && r) {
			previousDescriptor.get = r.get;
			previousDescriptor.set = r.set;
		}

        return previousDescriptor;
    }

    return c > 3 && r && Object.defineProperty(target, key, r), r;
})
		""")

		private val metadata: dynamic = js("""
(function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
})
		""")
	}
}

fun <T : Any> metadataOf(type: KClass<T>, configurer: Metadata<T>.() -> Unit): Metadata<T> {
	return Metadata(type).apply(configurer)
}

interface PropertyDecorator
interface MethodDecorator
