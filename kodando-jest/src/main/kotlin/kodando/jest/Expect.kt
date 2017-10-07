@file:Suppress("unused")

package kodando.jest

import kotlin.js.RegExp

external interface Expect<in T> {
    val not: Expect<T>

    /**
     * Uses === to test exact equality. If you want to check the value of an object, use toEqual instead.
     */
    fun toBe(value: T)

    /**
     * Recursively checks every field of an object or array.
     */
    fun toEqual(value: T)

    // TRUTHINESS

    /**
     * Matches only null
     */
    fun toBeNull()

    /**
     * Matches only undefined.
     */
    fun toBeUndefined()

    /**
     * Is the opposite of toBeUndefined
     */
    fun toBeDefined()

    /**
     * Matches anything that an if statement treats as true
     */
    fun toBeTruthy()

    /**
     * Matches anything that an if statement treats as false
     */
    fun toBeFalsy()

    /**
     * Verifies if the value matches the specified pattern.
     */
    fun toMatch(pattern: RegExp)

    /**
     * Verifies if the value is greater than the specified one.
     */
    fun toBeGreaterThan(value: Number)

    /**
     * Verifies if the value is greater than or equal to the specified one.
     */
    fun toBeGreaterThanOrEqual(value: Number)

    /**
     * Verifies if the value is less than the specified one.
     */
    fun toBeLessThan(value: Number)

    /**
     * Verifies if the value is less or equal than the specified one.
     */
    fun toBeLessThanOrEqual(value: Number)

    /**
     * Check if an array contains a particular item
     */
    fun toContain(element: Any?)

    /**
     * Check if something has been thrown.
     */
    @JsName("toThrow")
    fun toThrow()

    /**
     * Check if something has been thrown.
     */
    @JsName("toThrow")
    fun toThrow(error: Throwable)

    /**
     * Check if something has been thrown.
     */
    @JsName("toThrow")
    fun toThrow(errorMessage: String)

    /**
     * Check if something has been thrown.
     */
    @JsName("toThrow")
    fun toThrow(errorPattern: RegExp)
}

external fun <T> expect(value: T): Expect<T>
