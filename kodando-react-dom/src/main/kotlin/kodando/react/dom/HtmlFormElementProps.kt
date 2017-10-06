package kodando.react.dom

import org.w3c.dom.HTMLFormElement

external interface HtmlFormElementProps : HtmlElementProps<HTMLFormElement> {
    var action: String?
    var method: String?
    var autocomplete: String?
    var encoding: String?
    var enctype: String?
    var target: String?
}