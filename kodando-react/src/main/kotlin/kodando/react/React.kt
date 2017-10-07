package kodando.react

@JsModule("react")
@JsNonModule
external object React {

    @JsName("createElement")
    fun createElement(tag: String, props: Any, vararg children: Any?): ReactNode?

    @JsName("createElement")
    fun createElement(type: JsClass<*>, props: Any, vararg children: Any?): ReactNode?

}
