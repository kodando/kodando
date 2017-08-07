package kodando.rxjs

fun subscription(handler: () -> Unit) =
    Rx.Subscription(handler)

