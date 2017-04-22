package kodando.react

import org.w3c.dom.Element

/**
 * Created by danfm on 21/04/2017.
 */

typealias ElementReferenceHandler = (Element) -> Unit

typealias PropSetter<T> = T.() -> Unit
