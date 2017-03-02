package kodando.react.dom

interface HTMLElementAnchorElementProps : HTMLElementAttributes {
	@JsName("href")
	var href: String?

	@JsName("hrefLang")
	var hrefLang: String?

	@JsName("rel")
	var rel: String?
}