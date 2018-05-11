@file:JsModule("rxjs")
@file:JsNonModule

package kodando.rxjs.scheduler

abstract external class Scheduler {
  abstract fun now(): Double
}
