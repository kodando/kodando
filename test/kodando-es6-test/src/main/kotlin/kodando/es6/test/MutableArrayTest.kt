package kodando.es6.test

import kodando.es6.mutableArrayOf
import kodando.jest.describe
import kodando.jest.expect
import kodando.jest.it

object MutableArrayTest {
    init {
        describe("The MutableArray") {
            it("should be just the same array in JS") {
                val array = mutableArrayOf(1, 2, 3)

                expect(js("(Array.isArray(array))")).toBeTruthy()
            }
        }
    }
}