package kodando.rxjs.tests.operator

import kodando.jest.Spec
import kodando.rxjs.Observable
import kodando.rxjs.factory.empty
import kodando.rxjs.factory.emptyWithScheduler
import kodando.rxjs.scheduler.asyncScheduler
import kodando.rxjs.tests.expectations.shouldBeObservable

object EmptyOperatorSpec : Spec() {
    init {
        describe("Observable.empty") {
            it("usage 1") byChecking {
                val observable = Observable.empty<Int>()

                observable.shouldBeObservable()
            }

            it("usage 2") byChecking {
                val observable = Observable.emptyWithScheduler<Int>(asyncScheduler)

                observable.shouldBeObservable()
            }
        }
    }
}