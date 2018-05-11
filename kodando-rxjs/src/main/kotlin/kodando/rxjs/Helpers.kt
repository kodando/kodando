package kodando.rxjs

fun subscription(handler: () -> Unit) =
  Subscription(handler)

inline fun <T> createObserverLike(): ObserverLike<T> {
  return ObserverLikeImpl()
}
