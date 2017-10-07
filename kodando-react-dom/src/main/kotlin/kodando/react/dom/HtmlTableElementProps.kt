@file:Suppress("UnsafeCastFromDynamic")

package kodando.react.dom

import org.w3c.dom.HTMLTableElement

external interface HtmlTableElementProps : HtmlElementProps<HTMLTableElement> {
    var align: String?
    var border: String?
    var frame: String?
    var summary: String?
    var cellPadding: Any?
    var cellSpacing: Any?
}

