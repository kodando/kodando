package kodando.rxjs.tests.operators

import kodando.jest.*
import kodando.runtime.async.asyncPromise
import kodando.runtime.async.await
import kodando.rxjs.*
import kodando.rxjs.operators.combineLatest

fun testCombineLatest() {
    describe("Observable.combineLatest") {
        it("usage 1") {
            val a = Subject<Int>()
            val b = Subject<Int>()
            val c = Observable.combineLatest(a, b, { a, b -> a + b })

            asyncPromise {
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
