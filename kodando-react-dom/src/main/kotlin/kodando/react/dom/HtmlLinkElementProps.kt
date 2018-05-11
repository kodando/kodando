package kodando.react.dom

import org.w3c.dom.HTMLLinkElement

external interface HtmlLinkElementProps : HtmlElementProps<HTMLLinkElement> {
  var charset: String?
  var disabled: Boolean?
  var href: String?
  var hreflang: String?
  var media: String?
  var rel: String?
  var rev: String?
  var target: String?
  var type: String?
}

