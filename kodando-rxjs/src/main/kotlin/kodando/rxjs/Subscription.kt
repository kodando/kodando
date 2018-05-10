@file:JsModule("rxjs")
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
open external class Subscription(unsubscribe: () -> Unit) : Unsubscribable {
    /**
     * A flag to indicate whether this Subscription has already been unsubscribed.
     */
    val closed: Boolean

    /**
     * Adds a tear down to be called during the unsubscribe() of this Subscription.
     */
    @JsName("add")
    fun add(unsubscribe: TeardownLogic): Unsubscribable

    /**
     * Adds a tear down to be called during the unsubscribe() of this Subscription.
     */
    @JsName("add")
    fun add(subscription: Unsubscribable): Unsubscribable

    /**
     * emoves a Subscription from the internal list of subscriptions that will unsubscribe during the unsubscribe process of this Subscription.
     */
    @JsName("remove")
    fun remove(subscription: Unsubscribable)

    /**
     * @see Unsubscribable.unsubscribe()
     */
    override fun unsubscribe()

    companion object {
        val EMPTY: Unsubscribable
    }

}
