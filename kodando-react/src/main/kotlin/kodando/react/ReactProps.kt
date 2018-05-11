package kodando.react

import kotlin.js.Json

external interface ReactProps : Json {
  var key: String?
  var children: ReactChildren?
  var ref: Ref?
}
