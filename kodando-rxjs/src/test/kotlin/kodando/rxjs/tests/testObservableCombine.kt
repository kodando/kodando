package kodando.rxjs.tests

import kodando.jest.*
import kodando.runtime.async.asyncPromise
import kodando.runtime.async.await
import kodando.rxjs.*

fun testObservableCombine() {
    describe("Observable.combineAll") {
        it("should combine the observables into all") {
            val one = Observable.of(1)
            val two = Observable.of(2)
            val combined = Observable.of(one, two).combineAll()

            asyncPromise {
                val produced = await(combined.toArray().toPromise())
                val expected = arrayOf(arrayOf(1, 2))

                expect(produced).toEqual(expected)
            }
        }
    }
}
