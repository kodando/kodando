package kodando.mithril.routing

import kodando.history.BrowserHistoryInstance
import kodando.history.History
import kodando.mithril.Applier
import kodando.mithril.Props

val lazilyBrowserHistory by lazy {
  History.createBrowserHistory()
}

fun Props.browserHistory(history: BrowserHistoryInstance? = null, applier: Applier<Props>) {
  router {
    this.history = history ?: lazilyBrowserHistory
    applier()
  }
}
