package kodando.runtime.unsafe

/**
 * Created by danfma on 22/04/17.
 */

fun <T> objectWithShapeOf(): T = js("({})")

fun <T> objectWithShapeBy(setter: T.() -> Unit): T {
  val obj = objectWithShapeOf<T>()
  obj.setter()
  return obj
}
