package kodando.rxjs.tests.operator

import kodando.jest.Spec
import kodando.rxjs.observable.defer
import kodando.rxjs.observable.deferWhen
import kodando.rxjs.observable.of
import kodando.rxjs.tests.expectations.shouldBeObservable
import kotlin.js.Promise

object DeferOperatorSpec : Spec() {
  init {
    describe("the defer operator") {
      it("usage 1") byChecking {
        val observable = defer { of(1) }

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
