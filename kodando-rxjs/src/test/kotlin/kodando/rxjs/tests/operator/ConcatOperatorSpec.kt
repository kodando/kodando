package kodando.rxjs.tests.operator

import kodando.jest.Spec
import kodando.jest.expect
import kodando.runtime.async.await
import kodando.rxjs.Observable
import kodando.rxjs.factory.concat
import kodando.rxjs.factory.from
import kodando.rxjs.factory.of
import kodando.rxjs.operator.toArray
import kodando.rxjs.scheduler.asyncScheduler

object ConcatOperatorSpec : Spec() {
    init {
        describe("Observable.concat") {
            it("usage 1") byCheckingAfter {
                val one = Observable.of(1, 2, 3)
                val two = Observable.of(4, 5, 6)
                val result = Observable.concat(one, two)
                val produced = await(result.toArray().toPromise())

                expect(produced).toEqual(arrayOf(1, 2, 3, 4, 5, 6))
            }

            it("usage 2") byCheckingAfter {
                val one = Observable.from(arrayOf(1, 2))
                val two = Observable.from(arrayOf(3, 4))
                val three = Observable.from(arrayOf(5, 6))
                val result = Observable.concat(one, two, three)
                val produced = await(result.toArray().toPromise())

                expect(produced).toEqual(arrayOf(1, 2, 3, 4, 5, 6))
            }

            it("usage 3") byCheckingAfter {
                val one = Observable.from(arrayOf(1, 2, 3))
                val two = Observable.from(arrayOf(4, 5, 6))
                val result = Observable.concat(one, two, scheduler = asyncScheduler)
                val produced = await(result.toArray().toPromise())

                expect(produced).toEqual(arrayOf(1, 2, 3, 4, 5, 6))
            }
        }
    }
}
