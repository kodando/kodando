@file:JsModule("rxjs/Rx")
@file:JsNonModule

package kodando.rxjs

external class SubjectSubscriber<in T>(destination: Observer<T>) : Subscriber<T>