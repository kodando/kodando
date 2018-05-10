package kodando.rxjs.tests

import kodando.jest.Spec
import kodando.jest.expect
import kodando.runtime.async.await
import kodando.rxjs.observable.of
import kodando.rxjs.observable.throwError
import kodando.rxjs.subscribeWith
import kotlin.js.Promise

object ObservableExtensionsSpec : Spec() {
    init {
        describe("When subscribing an observable") {
            it("should be able use an object like subscription") byCheckingAfter {
                val observable = of(1)

                val tracker = await(Promise<Tracker> { resolve, reject ->
                    val tracker = Tracker()

                    observable.subscribeWith {
                        next = {
                            tracker.nextCalled = true
                        }

                        error = {
                            tracker.errorCalled = true
                            reject(TrackerException(tracker))
                        }

                        complete = {
                            tracker.completeCalled = true
                            resolve(tracker)
                        }
                    }
                })

                expect(tracker.nextCalled).toBeTruthy()
                expect(tracker.errorCalled).toBeFalsy()
                expect(tracker.completeCalled).toBeTruthy()
            }

            it("should be able use an object like subscription to handle errors") byCheckingAfter {
                val observable = throwError<Tracker>(Exception())

                val tracker = await(Promise<Tracker> { resolve, reject ->
                    val tracker = Tracker()

                    observable.subscribeWith {
                        next = {
                            tracker.nextCalled = true
                        }

                        error = {
                            tracker.errorCalled = true
                            resolve(tracker)
                        }

                        complete = {
                            tracker.completeCalled = true
                            resolve(tracker)
                        }
                    }
                })

                expect(tracker.nextCalled).toBeFalsy()
                expect(tracker.errorCalled).toBeTruthy()
                expect(tracker.completeCalled).toBeFalsy()
            }
        }
    }

    class Tracker {
        var nextCalled: Boolean = false
        var completeCalled: Boolean = false
        var errorCalled: Boolean = false
    }

    class TrackerException(val tracker: Tracker) : Exception()
}