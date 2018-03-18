package kodando.mithril.routing

import kodando.history.BrowserHistoryInstance
import kodando.history.Location
import kodando.mithril.Props
import kodando.mithril.createPropsAndAlso

interface RoutedProps : Props {
    var match: Match?
    var location: Location
    var history: BrowserHistoryInstance
}

fun routedProps(
    match: Match?,
    location: Location,
    history: BrowserHistoryInstance): RoutedProps {

    return createPropsAndAlso {
        it.match = match
        it.location = location
        it.history = history
    }
}
