package kodando.mobx.location

/**
 * Created by danfma on 17/01/2017.
 */
@JsModule("mobx-location")
@JsNonModule
external object MobxLocation {

	@JsName("default")
	object currentLocation {
		var hash: String
		var host: String
		var hostname: String
		var href: String
		var origin: String
		var port: String
		var protocol: String
		var search: String
	}

}