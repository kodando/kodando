package kodando.react

import kotlin.js.Json

external interface ReactNode {
  val type: String
  val props: Json
}