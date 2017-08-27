package kodando.rxjs.tests.operators

import kodando.jest.describe
import kodando.jest.it
import kodando.rxjs.Observable
import kodando.rxjs.Scheduler
import kodando.rxjs.operators.interval
import kodando.rxjs.tests.expectations.shouldBeObservable

fun testInterval() {
    describe("Observable.interval") {
        it("should accept period") {
            val observable = Observable.interval(1000)

            observable.shouldBeObservable()
        }

        it("should accept period and scheduler") {
            val observable = Observable.interval(1000, scheduler = Scheduler.async)

            observable.shouldBeObservable()
        }
    }
}