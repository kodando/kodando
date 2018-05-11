package kodando.rxjs.observable

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import

private val never_: JsFunction =
  fromModule("rxjs") import "NEVER"


fun never(): Observable<Nothing> {
  return never_.unsafeCast<Observable<Nothing>>()
}
