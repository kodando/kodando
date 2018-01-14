package kodando.rxjs.tests

import kodando.jest.Spec
import kodando.jest.expect
import kodando.rxjs.Observable
import kodando.rxjs.factory.bindCallback
import kodando.rxjs.factory.bindCallbackWithScheduler
import kodando.rxjs.scheduler.asyncScheduler

object ObservableBindCallbackSpec : Spec() {
    init {
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
            it("usage 1") byChecking {
                val producer = Observable.bindCallback(::increment)

                shouldBeFunction(producer)
                shouldBeAnObservable(producer(1))
            }

            it("usage 2") byChecking {
                val producer = Observable.bindCallbackWithScheduler(asyncScheduler, ::increment)

                shouldBeFunction(producer)
                shouldBeAnObservable(producer(1))
            }

            it("usage 3") byChecking {
                val producer = Observable.bindCallback(::increment) { it.toDouble() }

                shouldBeFunction(producer)
                shouldBeAnObservable(producer(1))
            }

            it("usage 4") byChecking {
                val producer = Observable.bindCallbackWithScheduler(asyncScheduler, ::increment) { it.toDouble() }

                shouldBeFunction(producer)
                shouldBeAnObservable(producer(1))
            }
        }
    }
}