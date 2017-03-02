package kodando.react.router

import kodando.react.dom.HTMLElementAnchorElementProps

interface LinkProps : HTMLElementAnchorElementProps {
	var to: String
	var className: String?
	var activeClassName: String?
	var activeOnlyWhenExact: Boolean?
}
