package kodando.rxjs.tests

import kodando.jest.Spec
import kodando.jest.expect
import kodando.rxjs.observable.fromPromise
import kodando.rxjs.tests.expectations.shouldBeObservable
import kotlinx.coroutines.await
import kotlin.js.Promise

object ObservableFromPromiseSpec : Spec() {
  init {
    describe("fromPromise") {
      ObservableCreateSpec.it("should return the promised value") byCheckingAfter {
        val observable = fromPromise(Promise.resolve(1))
        val produced = observable.toPromise().await()

        expect(produced).toBe(1)
      }

      it("should produce later") byCheckingAfter {
        val promise = Promise<Boolean> { resolve, _ ->
          waitTime(1).then {
            resolve(true)
          }
        }

        val observable = fromPromise(promise)

        observable.shouldBeObservable()

        val produced = observable.toPromise().await()

        expect(produced).toBeTruthy()
      }

      it("should create a observable with the promised value") byCheckingAfter {
        val observable = fromPromise(Promise.resolve(1))
        val produced = observable.toPromise().await()

        expect(produced).toBe(1)
      }
    }
  }
}
