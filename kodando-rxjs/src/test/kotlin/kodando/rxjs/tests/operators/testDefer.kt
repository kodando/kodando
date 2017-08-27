package kodando.rxjs.tests.operators

import kodando.jest.describe
import kodando.jest.it
import kodando.rxjs.Observable
import kodando.rxjs.operators.defer
import kodando.rxjs.operators.deferWhen
import kodando.rxjs.tests.expectations.shouldBeObservable
import kotlin.js.Promise

fun testDefer() {
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
