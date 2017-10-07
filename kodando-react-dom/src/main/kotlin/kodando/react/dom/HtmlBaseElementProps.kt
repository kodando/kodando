package kodando.react.dom

import org.w3c.dom.HTMLBaseElement

external interface HtmlBaseElementProps : HtmlElementProps<HTMLBaseElement> {
    var href: String?
    var target: String?
}

