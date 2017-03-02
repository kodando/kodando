package kodando.react.dom.events

@JsName("StyleMedia")
external interface StyleMediaSpec {
    val type: String
    fun matchMedium(mediaquery: String): Boolean
}