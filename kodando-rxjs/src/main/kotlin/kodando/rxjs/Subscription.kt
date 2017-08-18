@file:JsModule("rxjs/Rx")
@file:JsNonModule

package kodando.rxjs

/**
 * Represents a disposable resource, such as the execution of an Observable.
 * A Subscription has one important method, unsubscribe, that takes no argument and just disposes the resource
 * held by the subscription.
 *
 * Additionally, subscriptions may be grouped together through the add() method, which will attach a child
 * Subscription to the current Subscription. When a Subscription is unsubscribed, all its children
 * (and its grandchildren) will be unsubscribed as well.
 *
 * @see 'http://reactivex.io/rxjs/class/es6/Subscription.js~Subscription.html'
 */
external class Subscription(unsubscribe: () -> Unit) : ISubscription {
    /**
     * A flag to indicate whether this Subscription has already been unsubscribed.
     */
    val closed: Boolean

    /**
     * Adds a tear down to be called during the unsubscribe() of this Subscription.
     */
    fun add(unsubscribe: () -> Unit): ISubscription

    /**
     * Adds a tear down to be called during the unsubscribe() of this Subscription.
     */
    fun add(subscription: ISubscription): ISubscription

    /**
     * emoves a Subscription from the internal list of subscriptions that will unsubscribe during the unsubscribe process of this Subscription.
     */
    fun remove(subscription: ISubscription)

    /**
     * @see ISubscription.unsubscribe()
     */
    override fun unsubscribe()

    companion object {
        val EMPTY: ISubscription
    }
}
