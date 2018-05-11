package kodando.react.dom

import org.w3c.dom.HTMLImageElement

external interface HtmlImageElementProps : HtmlElementProps<HTMLImageElement> {
  var src: String
  var alt: String?
}