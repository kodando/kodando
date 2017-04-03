package kodando.react.history

import kodando.react.Component
import kodando.react.ReactElement

/**
 * Created by danfma on 01/03/2017.
 */

@JsModule("react-history")
@JsNonModule
external object ReactHistory {

    class HashHistory : Component<HashHistoryProps, Unit> {
        override fun render(): ReactElement?
    }

}