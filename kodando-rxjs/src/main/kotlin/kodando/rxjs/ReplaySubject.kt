@file:JsModule("rxjs/Rx")
@file:JsNonModule

package kodando.rxjs

external open class ReplaySubject<T>(bufferSize: Int = definedExternally,
                                     windowSize: Int = definedExternally,
                                     scheduler: Scheduler = definedExternally) : Subject<T>

