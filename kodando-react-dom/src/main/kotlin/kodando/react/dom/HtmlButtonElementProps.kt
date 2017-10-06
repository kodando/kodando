package kodando.react.dom

import org.w3c.dom.HTMLButtonElement

external interface HtmlButtonElementProps : HtmlElementProps<HTMLButtonElement> {
    var autoFocus: Boolean?
    var disabled: Boolean?
    var type: String?
}

