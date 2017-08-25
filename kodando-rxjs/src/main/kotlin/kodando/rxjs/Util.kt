package kodando.rxjs

fun subscription(handler: () -> Unit) =
    Subscription(handler)

