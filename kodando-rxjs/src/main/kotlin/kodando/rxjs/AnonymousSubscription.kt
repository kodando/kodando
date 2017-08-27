package kodando.rxjs

/**
 * A subscription contract.
 */
external interface AnonymousSubscription {
    /**
     * Disposes the resources held by the subscription.
     * May, for instance, cancel an ongoing Observable execution or cancel any
     * other type of work that started when the Subscription was created.
     */
    fun unsubscribe()
}
