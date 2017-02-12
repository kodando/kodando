package kodando.rxjs

/**
 * Created by danfma on 17/01/2017.
 */

fun subscription(handler: () -> Unit) =
	Rx.Subscription(handler)
