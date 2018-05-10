package kodando.rxjs.tests

import kodando.jest.Spec
import kodando.rxjs.observable.interval
import kodando.rxjs.scheduler.asyncScheduler
import kodando.rxjs.tests.expectations.shouldBeObservable

object ObservableIntervalSpec : Spec() {
    init {
        describe("interval") {
            it("should accept period") byCheckingAfter {
                val observable = interval(1000)

                observable.shouldBeObservable()
            }

            it("should accept period and scheduler") byChecking {
                val observable = interval(1000, scheduler = asyncScheduler)

                observable.shouldBeObservable()
            }
        }
    }
}
