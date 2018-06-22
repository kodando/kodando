package kodando.store

interface Action {
  @JsName("type")
  val type: String
}
