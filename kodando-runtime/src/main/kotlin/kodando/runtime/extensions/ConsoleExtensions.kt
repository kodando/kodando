package kodando.runtime.extensions

import kotlin.js.Console

fun Console.groupCollapsed(vararg args: Any?) =
  this.asDynamic().groupCollapsed.apply(this, args)

fun Console.groupEnd() =
  this.asDynamic().groupEnd()
