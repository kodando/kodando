package kodando.react.dom.events

external class StyleMedia : StyleMediaSpec {
  override val type: String
  override fun matchMedium(mediaquery: String): Boolean
}