package kodando.rxjs.tests.operator

import kodando.jest.Spec
import kodando.jest.it
import kodando.rxjs.Observable
import kodando.rxjs.factory.defer
import kodando.rxjs.factory.deferWhen
import kodando.rxjs.factory.of
import kodando.rxjs.tests.expectations.shouldBeObservable
import kotlin.js.Promise

object DeferOperatorSpec : Spec() {
    init {
        describe("Observable.defer") {
            it("usage 1") {
                val observable = Observable.defer { Observable.of(1) }

                observable.shouldBeObservable()
            }

            it("usage 2") {
                val promise = Promise<Int> { resolve, _ ->
                    resolve(1)
                }

                val observable = Observable.deferWhen { promise }

                observable.shouldBeObservable()
            }
        }
    }
}
