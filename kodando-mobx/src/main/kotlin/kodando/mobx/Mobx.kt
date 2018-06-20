package kodando.mobx

import kotlin.coroutines.experimental.suspendCoroutine
import kotlin.js.*

fun <T> observable(value: T) = BoxedPropertyProvider(value)

fun <T> computed(getter: () -> T) = BoxedComputedPropertyProvider(getter)

fun <TFunc : Function<R>, R> action(handler: TFunc) = ActionPropertyProvider(handler)

fun <T, R> asyncAction(handler: SuspendableAsyncFunc<T, R>) = AsyncActionPropertyProvider(handler)

suspend fun <T> Promise<T>.await(): T {
  return suspendCoroutine { c ->
    val actionName = "${(c.context as? ActionContext)?.actionName ?: "action"} (resumed)"

    then {
      Mobx.runInAction(actionName) {
        c.resume(it)
      }

    }.catch {
      c.resumeWithException(it)
    }
  }
}

fun autorun(
  delay: Int? = undefined,
  name: String? = undefined,
  runnable: () -> Unit): MobxDisposer {

  return Mobx.autorun(runnable, json("delay" to delay, "name" to name))
}

typealias MobxDisposer = () -> Unit

@JsModule("mobx")
external object Mobx {

  interface Decorator

  interface ReadableValue<T> {
    fun get(): T
  }

  interface WriteableValue<T> {
    fun set(value: T)
  }

  interface ComputedObservable<T> : ReadableValue<T>

  interface ObservableValue<T> : ReadableValue<T>, WriteableValue<T>

  fun get(thing: Any, key: String): Any?
  fun set(thing: Any, key: String, value: Any?)
  fun extendObservable(target: Any, newProperties: Json)
  fun decorate(target: Any, decorators: Json)
  fun autorun(closure: () -> Unit): MobxDisposer
  fun autorun(closure: () -> Unit, options: Json): MobxDisposer

  @JsName("runInAction")
  fun <R, Func : Function<R>> runInAction(action: Func): R

  @JsName("runInAction")
  fun <R, Func : Function<R>> runInAction(name: String, action: Func): R

  fun <T> computed(getter: () -> T, options: Json = definedExternally): ComputedObservable<T>

  @JsName("action")
  fun <TFunc : Function<R>, R> action(handler: TFunc): TFunc

  @JsName("action")
  fun <TFunc : Function<R>, R> action(name: String, handler: TFunc): TFunc

  @JsName("computed")
  val computedDecorator: Decorator

  @JsName("action")
  val actionDecorator: Decorator

  @JsName("observable")
  object Observable {

    @JsName("box")
    fun <T> box(value: T): ObservableValue<T>

    @JsName("box")
    fun <T> box(value: T, options: Json): ObservableValue<T>

  }

}
