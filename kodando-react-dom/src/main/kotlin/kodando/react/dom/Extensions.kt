package kodando.react.dom

import kodando.react.ReactElement
import org.w3c.dom.Element

/**
 * Created by danfma on 25/04/17.
 */

fun ReactElement.renderTo(container: Element) {
    ReactDOM.render(this, container)
}
