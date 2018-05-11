package kodando.react.dom

import org.w3c.dom.HTMLMetaElement

external interface HtmlMetaElementProps : HtmlElementProps<HTMLMetaElement> {
  var charset: String?
  var content: String?
  var scheme: String?
  var url: String?
}

