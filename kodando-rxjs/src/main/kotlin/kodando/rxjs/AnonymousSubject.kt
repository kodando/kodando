@file:JsModule("rxjs/Rx")
@file:JsNonModule

package kodando.rxjs

external class AnonymousSubject<T>(destination: Observable<T>, source: Observer<T>) : Subject<T>