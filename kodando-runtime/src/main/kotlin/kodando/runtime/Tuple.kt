@file:Suppress("unused", "UnsafeCastFromDynamic", "UNUSED_PARAMETER")

package kodando.runtime

interface Tuple<T>
interface Tuple2<T1, T2> : Tuple<T1>
interface Tuple3<T1, T2, T3> : Tuple2<T1, T2>

inline val <T1> Tuple<T1>.first: T1 get() = this.asDynamic()[0]
inline val <T2> Tuple2<*, T2>.second: T2 get() = this.asDynamic()[1]
inline val <T3> Tuple3<*, *, T3>.third: T3 get() = this.asDynamic()[2]


fun <T1> tupleOf(value: T1): Tuple<T1> = js("[value]")
fun <T1, T2> tupleOf(value1: T1, value2: T2): Tuple2<T1, T2> = js("[value1, value2]")
fun <T1, T2, T3> tupleOf(value1: T1, value2: T2, value3: T3): Tuple3<T1, T2, T3> = js("[value1, value2, value3]")
