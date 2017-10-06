package kodando.hasher

external interface ChangedSignal {
    fun add(parser: (newHash: String, oldHash: String) -> Unit)
}