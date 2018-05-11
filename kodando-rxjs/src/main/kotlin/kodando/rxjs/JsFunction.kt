package kodando.rxjs

external interface JsFunction {
  fun <T> call(self: Any?, vararg parameters: Any?): T
  fun <T> apply(self: Any?, parameters: Array<*>): T
}
