package kodando.rxjs.tests

import kodando.jest.Spec
import kodando.jest.expect
import kodando.runtime.async.await
import kodando.rxjs.observable.from
import kodando.rxjs.observable.fromArray
import kodando.rxjs.observable.of
import kodando.rxjs.operators.toArray

object ObservableFromSpec : Spec() {
    init {
        describe("fromArray") {
            it("should return the array value") byCheckingAfter {
                val observable = fromArray(arrayOf(1, 2))
                val produced = await(observable.toArray().toPromise())
                val expected = arrayOf(1, 2)

                expect(produced).toEqual(expected)
            }
        }

        describe("from(Observable)") {
            it("should return the observable values") byCheckingAfter {
                val source = of(1)
                val observable = from(source)

                val produced = await(observable.toArray().toPromise())
                val expected = arrayOf(1)

                expect(produced).toEqual(expected)
            }
        }
    }
}
