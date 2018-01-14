package kodando.rxjs.tests

import kodando.jest.Spec
import kodando.jest.expect
import kodando.runtime.async.await
import kodando.rxjs.Observable
import kodando.rxjs.Subject
import kodando.rxjs.factory.combineLatest
import kodando.rxjs.operator.toArray

object ObservableCombineLatestSpec : Spec() {
    init {
        describe("Observable.combineLatest") {
            it("usage 1") byCheckingAfter {
                val a = Subject<Int>()
                val b = Subject<Int>()
                val c = Observable.combineLatest(a, b, { a, b -> a + b })

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
