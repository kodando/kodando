@file:JsModule("rxjs")
@file:JsNonModule

package kodando.rxjs

import kodando.rxjs.scheduler.Scheduler

open external class ReplaySubject<T>(
  bufferSize: Int = definedExternally,
  windowSize: Int = definedExternally,
  scheduler: Scheduler = definedExternally) : Subject<T>

