@file:JsModule("rxjs/BehaviorSubject")
@file:JsNonModule

package kodando.rxjs

open external class BehaviorSubject<T>(initialValue: T) : Subject<T> {
    val value: T
    fun getValue(): T
}
