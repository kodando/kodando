package kodando.react.dom

import kodando.react.dom.events.SyntheticEvent
import org.w3c.dom.HTMLIFrameElement

external interface HtmlIFrameElementProps : HtmlElementProps<HTMLIFrameElement> {
  var align: String?
  var disabled: Boolean?
  var border: String?
  var scrolling: String?
  var src: String?
  var vspace: Number?
  var onLoad: ((SyntheticEvent<HTMLIFrameElement>) -> Unit)?
}