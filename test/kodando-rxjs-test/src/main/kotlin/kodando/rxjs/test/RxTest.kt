package kodando.rxjs.test

import kodando.rxjs.Rx
import kodando.jest.expect
import kodando.jest.test

/**
 * Created by danfm on 11/02/2017.
 */
object RxTest {
    init {
        test("Rx should be imported") {
            expect(Rx).not.toBeNull()
            expect(Rx).not.toBeUndefined()
        }
    }
}