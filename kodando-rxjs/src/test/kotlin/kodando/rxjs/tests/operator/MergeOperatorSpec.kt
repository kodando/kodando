package kodando.rxjs.tests.operator

import kodando.jest.Spec
import kodando.rxjs.observable.merge
import kodando.rxjs.observable.of
import kodando.rxjs.scheduler.asyncScheduler
import kodando.rxjs.tests.expectations.shouldBeObservable

object MergeOperatorSpec : Spec() {
  init {
    describe("merge") {
      it("should accept one observable") byChecking {
        val result = merge(
          of(1)
        )

        result.shouldBeObservable()
      }

      it("should accept more observables") byChecking {
        val result = merge(
          of(1),
          of(2),
          of(3)
        )

        result.shouldBeObservable()
      }

      it("should accept observables with concurrent limit") byChecking {
        val result = merge(
          of(1),
          of(2),
          of(3),
          concurrent = 2
        )

        result.shouldBeObservable()
      }

      it("should accept observables with scheduler") byChecking {
        val result = merge(
          of(1),
          of(2),
          of(3),
          scheduler = asyncScheduler
        )

        result.shouldBeObservable()
      }

      it("should accept observables with concurrent limit and scheduler") byChecking {
        val result = merge(
          of(1),
          of(2),
          of(3),
          concurrent = 2,
          scheduler = asyncScheduler
        )

        result.shouldBeObservable()
      }
    }
  }
}
