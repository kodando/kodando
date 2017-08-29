package kodando.rxjs.tests.operators

import kodando.jest.describe
import kodando.jest.it
import kodando.rxjs.Observable
import kodando.rxjs.Scheduler
import kodando.rxjs.operators.empty
import kodando.rxjs.operators.emptyWithScheduler
import kodando.rxjs.tests.expectations.shouldBeObservable

fun testEmpty() {


    describe("Observable.empty") {
        it("usage 1") {
            val observable = Observable.empty<Int>()

            observable.shouldBeObservable()
        }

        it("usage 2") {
            val observable = Observable.emptyWithScheduler<Int>(Scheduler.async)

            observable.shouldBeObservable()
        }
    }
}