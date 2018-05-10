package kodando.rxjs.tests

import kodando.jest.Spec
import kodando.jest.expect
import kodando.runtime.async.await
import kodando.rxjs.Subject
import kodando.rxjs.observable.combineLatest
import kodando.rxjs.operators.toArray

object ObservableCombineLatestSpec : Spec() {
    init {
        describe("combineLatest") {
            it("usage 1") byCheckingAfter {
                val a = Subject<Int>()
                val b = Subject<Int>()
                val c = combineLatest(a, b, { a, b -> a + b })

                val resultPromise = c.toArray().toPromise()

                a.next(1)
                a.next(2)
                a.complete()

                b.next(2)
                b.complete()

                val result = await(resultPromise)

                expect(result).toEqual(arrayOf(4))
            }
        }
    }
}
