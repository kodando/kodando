package kodando.rxjs.tests

import kodando.jest.Spec
import kodando.jest.expect
import kodando.runtime.async.await
import kodando.rxjs.observable.empty
import kodando.rxjs.observable.emptyScheduled
import kodando.rxjs.operators.toArray
import kodando.rxjs.scheduler.asyncScheduler
import kodando.rxjs.tests.expectations.shouldBeObservable

object ObservableEmptySpec : Spec() {
    init {
        describe("empty") {
            it("should return nothing") byCheckingAfter {
                val observable = empty<Int>()
                val produced = await(observable.toArray().toPromise())

                expect(produced.size).toBe(0)
            }

            it("usage 1") byChecking {
                val observable = empty<Int>()

                observable.shouldBeObservable()
            }

            it("usage 2") byChecking {
                val observable = emptyScheduled<Int>(asyncScheduler)

                observable.shouldBeObservable()
            }
        }
    }
}
