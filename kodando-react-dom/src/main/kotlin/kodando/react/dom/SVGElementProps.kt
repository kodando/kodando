package kodando.react.dom

import org.w3c.dom.svg.SVGElement

external interface SVGElementProps : HtmlElementProps<SVGElement> {
    var viewBox: String?
    var preserveAspectRatio: String?
}