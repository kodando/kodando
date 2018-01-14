package kodando.rxjs.tests

import kodando.jest.Spec
import kodando.jest.expect
import kodando.runtime.async.await
import kodando.rxjs.Observable
import kodando.rxjs.factory.fromPromise
import kodando.rxjs.tests.expectations.shouldBeObservable
import kotlin.js.Promise

object ObservableFromPromiseSpec : Spec() {
    init {
        describe("Observable.fromPromise") {
            it("should produce later") byCheckingAfter {
                val promise = Promise<Boolean> { resolve, _ ->
                    waitTime(1).then {
                        resolve(true)
                    }
                }

                val observable = Observable.fromPromise(promise)

                observable.shouldBeObservable()

                val produced = await(observable.toPromise())

                expect(produced).toBeTruthy()
            }
        }
    }
}