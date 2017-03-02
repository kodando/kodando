package kodando.react.router

import kodando.react.Component
import kodando.react.ReactElement
import kodando.react.ReactProps

interface MatchProps : ReactProps {
    var exactly: Boolean?
    var pattern: String
    var component: JsClass<out Component<*, *>>
    var render: (() -> ReactElement?)?
}