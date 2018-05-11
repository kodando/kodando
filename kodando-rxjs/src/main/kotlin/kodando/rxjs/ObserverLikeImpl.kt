package kodando.rxjs

class ObserverLikeImpl<T> : ObserverLike<T> {
  override var next: NextHandler<T>? = null
  override var error: ErrorHandler? = null
  override var complete: CompleteHandler? = null
}
