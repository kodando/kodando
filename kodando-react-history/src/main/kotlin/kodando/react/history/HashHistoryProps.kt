package kodando.react.history

import kodando.react.*

/**
 * Created by danfma on 26/01/17.
 */

interface HashHistoryProps : ReactProps {
    var basename: String?
    var forceRefresh: Boolean?
    var keyLength: Int?
}

fun hashHistory(propSetter: PropSetter<HashHistoryProps>): ReactElement? {
    val (children, props) = extractChildren(unsafePropsBy(propSetter))

    return React.createElement(ReactHistory.HashHistory::class.js, props, *children)
}
