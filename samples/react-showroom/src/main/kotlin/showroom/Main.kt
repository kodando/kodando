package showroom

import kodando.react.dom.ReactDOM
import kotlin.browser.document

/**
 * Created by danfm on 21/04/2017.
 */

fun main(args: Array<String>) {
    val container = document.getElementById("app")!!
    val shell = Shell { }

    ReactDOM.render(shell!!, container)
}

