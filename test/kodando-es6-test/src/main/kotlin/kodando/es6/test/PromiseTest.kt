package kodando.es6.test

import kodando.es6.Promise
import kodando.jest.describe
import kodando.jest.expect
import kodando.jest.it

/**
 * Created by danfm on 12/02/2017.
 */
object PromiseTest {
    init {
        describe("The Promise") {
            it("should be available as a type") {
                expect(Promise).not.toBeNull()
                expect(Promise).not.toBeUndefined()
            }
        }
    }
}

