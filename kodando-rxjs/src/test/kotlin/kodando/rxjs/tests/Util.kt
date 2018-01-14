package kodando.rxjs.tests

import kotlin.browser.window
import kotlin.js.Promise

fun waitTime(time: Int): Promise<Unit> {
    return Promise { resolve, _ ->
        window.setTimeout({ resolve(Unit) }, time)
    }
}
