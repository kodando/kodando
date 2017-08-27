package kodando.rxjs.tests.operators

import kodando.jest.describe
import kodando.jest.it
import kodando.rxjs.Observable
import kodando.rxjs.Scheduler
import kodando.rxjs.Scheduler.Companion
import kodando.rxjs.operators.merge
import kodando.rxjs.tests.expectations.shouldBeObservable

fun testMerge() {
    describe("Observable.merge") {
        it("should accept one observable") {
            val result = Observable.merge(
                Observable.of(1)
            )

            result.shouldBeObservable()
        }

        it("should accept more observables") {
            val result = Observable.merge(
                Observable.of(1),
                Observable.of(2),
                Observable.of(3)
            )

            result.shouldBeObservable()
        }

        it("should accept observables with concurrent limit") {
            val result = Observable.merge(
                Observable.of(1),
                Observable.of(2),
                Observable.of(3),
                concurrent = 2
            )

            result.shouldBeObservable()
        }

        it("should accept observables with scheduler") {
            val result = Observable.merge(
                Observable.of(1),
                Observable.of(2),
                Observable.of(3),
                scheduler = Scheduler.async
            )

            result.shouldBeObservable()
        }

        it("should accept observables with concurrent limit and scheduler") {
            val result = Observable.merge(
                Observable.of(1),
                Observable.of(2),
                Observable.of(3),
                concurrent = 2,
                scheduler = Companion.async
            )

            result.shouldBeObservable()
        }
    }
}
