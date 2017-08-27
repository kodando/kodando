@file:JsModule("rxjs/Rx")
@file:JsNonModule

package kodando.rxjs

external open class BehaviorSubject<T>(initialValue: T) : Subject<T> {
    val value: T
    fun getValue(): T
}
