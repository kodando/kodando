package kodando.jest.usage

import kodando.jest.Spec
import kodando.jest.expect
import kotlin.js.Promise

object CalculatorSpec : Spec() {
    init {
        describe("A test description") {
            it("should accept an immediate function") byChecking {
                expect(1 + 1).toBe(2)
            }

            it("should accept an async function") byCheckingAfter {
                Promise.resolve(true)
            }
        }
    }
}
