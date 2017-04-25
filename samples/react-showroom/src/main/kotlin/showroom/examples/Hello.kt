package showroom.stateless

import kodando.react.*
import kodando.react.dom.*
import kotlin.browser.document

/**
 * Created by danfma on 25/04/17.
 */

// Definition:
// 1. Create an extension function to ReactProps with some name (the component name)
// 2. In this case, the div is already an extension to ReactProps, so it will be added
//    automatically as a child of the extended props.

fun ReactProps.hello(name: String) {
    div {
        append("Hello, $name!")
    }
}


fun helloUsage() {
    // Get a container element
    val container = document.getElementById("app")!!

    // render your element (use ksx helper to use your extension)
    val view = ksx {
        hello("Daniel")
    }

    // render to the dom by:
    // option 1 (just an extension method for option 2)
    view!!.renderTo(container)

    // option 2
    ReactDOM.render(view, container)
}
