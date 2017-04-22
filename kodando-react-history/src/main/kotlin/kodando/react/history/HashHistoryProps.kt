package kodando.react.history

import kodando.react.PropSetter
import kodando.react.React
import kodando.react.ReactElement
import kodando.react.ReactProps

/**
 * Created by danfma on 26/01/17.
 */

class HashHistoryProps : ReactProps() {
    var basename: String? by jsonProperty
    var forceRefresh: Boolean? by jsonProperty
    var keyLength: Int? by jsonProperty
}

fun hashHistory(propsSetter: PropSetter<HashHistoryProps>): ReactElement? {
    return React.createElement(ReactHistory.HashHistory::class.js, HashHistoryProps().apply(propsSetter))
}
