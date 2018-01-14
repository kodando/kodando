package kodando.rxjs.tests

import kodando.jest.Spec
import kodando.jest.expect
import kodando.runtime.async.await
import kodando.rxjs.Observable
import kodando.rxjs.factory.from
import kodando.rxjs.factory.of
import kodando.rxjs.operator.toArray
import kotlin.js.Promise

object ObservableFromSpec : Spec() {
    init {
        describe("Observable.from(Promise)") {
            it("should return the promised value") byCheckingAfter {
                val observable = kodando.rxjs.Observable.from(Promise.resolve(1))

                val produced = await(observable.toPromise())

                expect(produced).toBe(1)
            }
        }

        describe("Observable.from(Array)") {
            it("should return the array value") byCheckingAfter {
                val observable = Observable.from(arrayOf(1, 2))

                val produced = await(observable.toArray().toPromise())
                val expected = arrayOf(1, 2)

                expect(produced).toEqual(expected)
            }
        }

        describe("Observable.from(Observable)") {
            it("should return the observable values") byCheckingAfter {
                val source = Observable.of(1)
                val observable = Observable.from(source)

                val produced = await(observable.toArray().toPromise())
                val expected = arrayOf(1)

                expect(produced).toEqual(expected)
            }
        }
    }
}
