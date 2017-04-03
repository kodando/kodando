package kodando.react.dom

interface HTMLBaseElementAttributes : HTMLElementAttributes {
	@JsName("href")
	var href: String?

	@JsName("target")
	var target: String?
}

