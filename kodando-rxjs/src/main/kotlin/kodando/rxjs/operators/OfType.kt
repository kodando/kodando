@file:Suppress("UnsafeCastFromDynamic", "unused")

package kodando.rxjs.operators

import kodando.rxjs.Observable
import kotlin.reflect.KClass

/**
 * Created by danfma on 03/04/17.
 */

@JsName("ofType")
inline fun <reified R> Observable<*>.ofType(): Observable<R> =
  this.map { it as? R }
    .filter { it != null }
    .map { it!! }

@JsName("ofTypeOfClass")
inline fun <R : Any> Observable<*>.ofType(type: KClass<R>): Observable<R> =
  this.filter { type.isInstance(it) }
    .map { it as R }
