@file:JsModule("rxjs/Rx")
@file:JsNonModule

package kodando.rxjs

external abstract class Scheduler {
    abstract fun now(): Double
    abstract fun <T> schedule(work: ScheduleWork<T>, delay: Number = definedExternally, state: T = definedExternally)

    companion object {
        val animationFrame: Scheduler
        val asap: Scheduler
        val async: Scheduler
        val queue: Scheduler
    }
}
