package kodando.rxjs.tests

import kodando.jest.Spec
import kodando.jest.expect
import kodando.runtime.async.await
import kodando.rxjs.factory.empty
import kodando.rxjs.operator.toArray

object ObservableEmptySpec : Spec() {
    init {
        describe("Observable.empty") {
            it("should return nothing") byCheckingAfter {
                val observable = kodando.rxjs.Observable.empty<Int>()

                val produced = await(observable.toArray().toPromise())

                expect(produced.size).toBe(0)
            }
        }
    }
}
