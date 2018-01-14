@file:JsModule("rxjs/Scheduler")
@file:JsNonModule

package kodando.rxjs

abstract external class Scheduler {
    abstract fun now(): Double
}
