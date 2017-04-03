package kodando.crossroads

/**
 * Created by danfma on 17/03/17.
 */

@JsModule("crossroads")
external object CrossRoads {

    val bypassed: ByPassed

    @JsName("addRoute")
    fun addRoute(pattern: String): Route

    @JsName("addRoute")
    fun addRoute(pattern: String, handler: Function<*>): Route

    @JsName("addRoute")
    fun addRoute(pattern: String, handler: Function<*>, priority: Int): Route

    fun parse(route: String)

    fun removeAllRoutes()

}

external interface Route {
    val matched: Matched
}

external interface Matched {
    fun add(handler: Function<*>)
}

external interface ByPassed : Matched
