package kodando.mobx

import kodando.es6.Metadata
import kodando.es6.invoke
import kotlin.reflect.KClass

/**
 * Created by danfma on 15/01/2017.
 */

fun autorun(handler: () -> Unit) =
    Mobx.autorun(handler)

fun <T> computed(producer: () -> T) =
    Mobx.computed(producer)

fun <T> ref(value: T) =
    Mobx.Observable.ref(value)

fun <THandler : Function<*>> action(handler: THandler): THandler = Mobx.action(handler)
fun <THandler : Function<*>> action(name: String, handler: THandler): THandler = Mobx.action(name, handler)

fun <THandler : Function<*>> namedAction(name: String, handler: THandler) {
    action(name, handler).invoke()
}

fun <Key, Value> map() = Mobx.Observable.map<Key, Value>()

fun defineMethodsAsActions(type: KClass<*>) =
    defineMethodsAsActions(type.js)

fun defineMethodsAsActions(clazz: JsClass<*>) {
    val mobx = Mobx

    js("""
	var action = mobx.action;
	var prototype = clazz.prototype;
	var properties = Object.getOwnPropertyNames(prototype);

	properties.forEach(function(property) {
	    var member = prototype[property];
		var descriptor = Object.getOwnPropertyDescriptor(prototype, property);

	    if (!descriptor && typeof member === "function" && property !== "constructor") {
	        prototype[property] = action(property, member);
	    }
	});
	""")
}

fun Metadata<*>.methodAsActions() {
    defineMethodsAsActions(type)
}
