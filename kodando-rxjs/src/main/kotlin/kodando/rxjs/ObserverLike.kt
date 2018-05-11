package kodando.rxjs

external interface ObserverLike<T> {
  var next: NextHandler<T>?
  var error: ErrorHandler?
  var complete: CompleteHandler?
}
