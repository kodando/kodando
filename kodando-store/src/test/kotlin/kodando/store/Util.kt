package kodando.store

import kotlin.browser.window
import kotlin.js.Promise

fun delay(time: Int) =
  Promise<Boolean> { resolve, _ ->
    window.setTimeout({ resolve(true) }, time)
  }
