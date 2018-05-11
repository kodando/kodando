package kodando.runtime.es2015

import kotlin.js.Promise

inline fun <T> Promise<T>.thenNext(noinline producer: (T) -> Promise<T>): Promise<T> {
  return this.then(producer).unsafeCast<Promise<T>>()
}
