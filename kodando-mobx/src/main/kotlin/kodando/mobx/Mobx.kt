package kodando.mobx

import kodando.es6.JsMap
import kodando.es6.Tuple2
import kotlin.js.Json

/**
 * Created by danfma on 15/01/2017.
 */

typealias Disposer = () -> Unit

@JsModule("kodando/mobx")
@JsNonModule
external object Mobx {

    interface IReadOnlyComputed<out T> {
        fun get(): T
        fun subscribe(observer: (newValue: T, oldValue: T) -> Unit): Disposer
    }

    interface IObservable<T> {
        fun get(): T
        fun set(value: T)
        fun subscribe(observer: (newValue: T, oldValue: T) -> Unit): Disposer
    }

    fun <T> extendObservable(target: T, source: T)

    @JsName("observable")
    fun <T> observable(data: T): IObservable<T>

    @JsName("observable")
    fun <T> observable(): IObservable<T>

    @JsName("computed")
    fun <T> computed(getter: () -> T): IReadOnlyComputed<T>

    @JsName("action")
    fun <T : Function<*>> action(handler: T): T

    @JsName("action")
    fun <T : Function<*>> action(name: String, handler: T): T

    fun autorun(action: Function<Unit>): Disposer

    @JsName("reaction")
    fun <T> reaction(selector: () -> T, action: (T) -> Unit): Disposer

    @JsName("observable")
    object Observable {

        @JsName("object")
        fun <T> obj(target: T): T

        @JsName("ref")
        fun <T> ref(target: T): T

        @JsName("map")
        fun <Key, Value> map(vararg tuples: Tuple2<Key, Value>): ObservableMap<Key, Value>

    }

    class ObservableMap<Key, Value> : JsMap<Key, Value> {
        fun toJS(): Json
    }

}

