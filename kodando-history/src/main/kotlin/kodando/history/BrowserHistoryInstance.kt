package kodando.history

external interface BrowserHistoryInstance : HistoryInstance {
  fun createHref(location: Location): String
}
