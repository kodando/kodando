package kodando.rxjs.tests.operator

import kodando.jest.Spec
import kodando.jest.expect
import kodando.runtime.async.await
import kodando.rxjs.observable.concat
import kodando.rxjs.observable.fromArray
import kodando.rxjs.observable.of
import kodando.rxjs.operators.toArray

object ConcatOperatorSpec : Spec() {
  init {
    describe("The concat operator") {
      it("usage 1") byCheckingAfter {
        val one = of(1, 2, 3)
        val two = of(4, 5, 6)
        val result = concat(one, two)
        val produced = await(result.toArray().toPromise())

        expect(produced).toEqual(arrayOf(1, 2, 3, 4, 5, 6))
      }

      it("usage 2") byCheckingAfter {
        val one = fromArray(arrayOf(1, 2))
        val two = fromArray(arrayOf(3, 4))
        val three = fromArray(arrayOf(5, 6))
        val result = concat(one, two, three)
        val produced = await(result.toArray().toPromise())

        expect(produced).toEqual(arrayOf(1, 2, 3, 4, 5, 6))
      }

      it("usage 3") byCheckingAfter {
        val one = fromArray(arrayOf(1, 2, 3))
        val two = fromArray(arrayOf(4, 5, 6))

        val result = concat(one, two)
        val produced = await(result.toArray().toPromise())

        expect(produced).toEqual(arrayOf(1, 2, 3, 4, 5, 6))
      }
    }
  }
}
