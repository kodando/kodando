package kodando.rxjs.tests.operator

import kodando.jest.Spec
import kodando.rxjs.Observable
import kodando.rxjs.factory.defer
import kodando.rxjs.factory.deferWhen
import kodando.rxjs.factory.of
import kodando.rxjs.tests.expectations.shouldBeObservable
import kotlin.js.Promise

object DeferOperatorSpec : Spec() {
    init {
        describe("Observable.defer") {
            it("usage 1") byChecking {
                val observable = defer { Observable.of(1) }

                observable.shouldBeObservable()
            }

            it("usage 2") byChecking {
                val promise = Promise<Int> { resolve, _ ->
                    resolve(1)
                }

                val observable = deferWhen { promise }

                observable.shouldBeObservable()
            }
        }
    }
}
