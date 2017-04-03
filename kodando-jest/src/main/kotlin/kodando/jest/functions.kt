package kodando.jest

/**
 * Created by danfma on 11/02/2017.
 */

external fun test(name: String, handler: () -> Unit)

external fun <T> expect(value: T): Expect<T>

external interface Expect<in T> {
    val not: Expect<T>
    fun toBe(value: T)
    fun toBeNull()
    fun toBeUndefined()
    fun toBeTruthy()
}

external fun describe(name: String, handler: () -> Unit)
external fun it(description: String, expectationHandler: () -> Unit)