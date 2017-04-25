@file:Suppress("UnsafeCastFromDynamic", "NOTHING_TO_INLINE")

package kodando.runtime

/**
 * Created by danfma on 17/01/2017.
 */

inline fun <T : Function<R>, R> T.invoke(): R = this.asDynamic()()

inline fun <T : Function<R>, R> T.call(target: Any?, vararg data: Any): R =
	this.asDynamic().apply(target, data)

