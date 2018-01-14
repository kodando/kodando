@file:JsModule("rxjs/ReplaySubject")
@file:JsNonModule

package kodando.rxjs

open external class ReplaySubject<T>(
    bufferSize: Int = definedExternally,
    windowSize: Int = definedExternally,
    scheduler: Scheduler = definedExternally) : Subject<T>

