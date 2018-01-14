package kodando.rxjs.tests

import kodando.jest.Spec
import kodando.rxjs.Observable
import kodando.rxjs.factory.interval
import kodando.rxjs.scheduler.asyncScheduler
import kodando.rxjs.tests.expectations.shouldBeObservable

object ObservableIntervalSpec : Spec() {
    init {
        describe("Observable.interval") {
            it("should accept period") byCheckingAfter {
                val observable = Observable.interval(1000)

                observable.shouldBeObservable()
            }

            it("should accept period and scheduler") byChecking {
                val observable = Observable.interval(1000, scheduler = asyncScheduler)

                observable.shouldBeObservable()
            }
        }
    }
}
