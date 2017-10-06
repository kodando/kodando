package kodando.history

data class HashOptions(
    val basename: String = "",
    val hashType: String = "slash",
    val forceRefresh: Boolean = false,
    val keyLength: Int = 6,
    val getUserConfirmation: Function<*>? = null
)