package kodando.mithril.routing

import kotlin.js.RegExp

class Matcher(
  val re: RegExp,
  val keys: Array<String>
)