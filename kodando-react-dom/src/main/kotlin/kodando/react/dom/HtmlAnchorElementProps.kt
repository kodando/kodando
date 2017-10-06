package kodando.react.dom

import org.w3c.dom.HTMLAnchorElement

external interface HtmlAnchorElementProps : HtmlElementProps<HTMLAnchorElement> {
    var href: String?
    var hrefLang: String?
    var rel: String?
}
