package kodando.react.dom

interface SVGElementAttributes : HTMLElementAttributes {

	@JsName("viewBox")
	var viewBox: String?

	@JsName("preserveAspectRatio")
	var preserveAspectRatio: String?

}