package kodando.rxjs.tests.operators

import kodando.jest.*
import kodando.rxjs.Observable
import kodando.rxjs.Scheduler
import kodando.rxjs.operators.bindCallback
import kodando.rxjs.operators.bindCallbackWithScheduler

fun testBindCallback() {
    fun increment(value: Int) = value + 1

    fun shouldBeAnObservable(value: Any) {
        expect(value).not.toBeNull()
        expect(value is Observable<*>).toBeTruthy()
    }

    fun shouldBeFunction(value: Any) {
        expect(value).toBeDefined()
        expect(jsTypeOf(value)).toBe("function")
    }

    describe("Observable.bindCallback") {
        it("usage 1") {
            val producer = Observable.bindCallback(::increment)

            shouldBeFunction(producer)
            shouldBeAnObservable(producer(1))
        }

        it("usage 2") {
            val producer = Observable.bindCallbackWithScheduler(Scheduler.async, ::increment)

            shouldBeFunction(producer)
            shouldBeAnObservable(producer(1))
        }

        it("usage 3") {
            val producer = Observable.bindCallback(::increment) { it.toDouble() }

            shouldBeFunction(producer)
            shouldBeAnObservable(producer(1))
        }

        it("usage 4") {
            val producer = Observable.bindCallbackWithScheduler(Scheduler.async, ::increment) { it.toDouble() }

            shouldBeFunction(producer)
            shouldBeAnObservable(producer(1))
        }
    }
}