package kodando.rxjs.tests.operators

import kodando.jest.*
import kodando.runtime.async.asyncPromise
import kodando.runtime.async.await
import kodando.rxjs.*
import kodando.rxjs.operators.concat

fun testConcat() {
    describe("Observable.concat") {
        it("usage 1") {
            val one = Observable.of(1, 2, 3)
            val two = Observable.of(4, 5, 6)
            val result = Observable.concat(one, two)

            asyncPromise {
                val produced = await(result.toArray().toPromise())

                expect(produced).toEqual(arrayOf(1, 2, 3, 4, 5, 6))
            }
        }

        it("usage 2") {
            val one = Observable.from(arrayOf(1, 2))
            val two = Observable.from(arrayOf(3, 4))
            val three = Observable.from(arrayOf(5, 6))
            val result = Observable.concat(one, two, three)

            asyncPromise {
                val produced = await(result.toArray().toPromise())

                expect(produced).toEqual(arrayOf(1, 2, 3, 4, 5, 6))
            }
        }

        it("usage 3") {
            val one = Observable.from(arrayOf(1, 2, 3))
            val two = Observable.from(arrayOf(4, 5, 6))
            val result = Observable.concat(one, two, scheduler = Scheduler.async)

            asyncPromise {
                val produced = await(result.toArray().toPromise())

                expect(produced).toEqual(arrayOf(1, 2, 3, 4, 5, 6))
            }
        }
    }
}
