package kodando.react.dom

import kodando.react.dom.events.SyntheticEvent
import org.w3c.dom.HTMLBodyElement

interface HTMLBodyElementAttributes : HTMLElementAttributes {
	var background: String?
	var onLoad: ((SyntheticEvent<HTMLBodyElement>) -> Unit)?
}

