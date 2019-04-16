package kodando.rxjs.tests

import kodando.jest.Spec
import kodando.jest.expect
import kodando.runtime.async.await
import kodando.rxjs.Observable
import kodando.rxjs.observable.fromEvent
import kodando.rxjs.observable.of
import kodando.rxjs.operators.combineAll
import kodando.rxjs.operators.take
import kodando.rxjs.operators.toArray
import org.w3c.dom.events.Event
import kotlin.browser.document

/**
 * Created by danfma on 03/05/17.
 */

object ObservableCreateSpec : Spec() {
  init {
    describe("Observable") {
      it("should be able to produce elements") byCheckingAfter {
        val observable = Observable<Int> { observer ->
          observer.next(1)
          observer.next(2)
          observer.complete()

          null
        }

        val produced = await(observable.toArray().toPromise())
        val expected = arrayOf(1, 2)

        expect(produced).toEqual(expected)
      }
    }

    describe("createWithSubscription") {
      it("should be able to produce and unsubscribe after") byCheckingAfter {
        val source = of(1)

        val observable = Observable<Int> { observer ->
          source.subscribe(observer)
        }

        val produced = await(observable.toArray().toPromise())
        val expected = arrayOf(1)

        expect(produced).toEqual(expected)
      }
    }

    describe("fromEvent") {
      xit("should return the events of this target") byCheckingAfter {
        val click = document.createEvent("Event")

        click.initEvent("click", true, true)

        val source = document.createElement("div")
        val observable = fromEvent<Event>(source, "click")

        val promise = observable.take(1).toPromise()

        source.dispatchEvent(click)

        val produced = await(promise)
        val expected = click

        expect(produced).toBe(expected)
      }
    }

    describe("combineAll") {
      it("should combine the observables into all") byCheckingAfter {
        val one = of(1)
        val two = of(2)
        val combined = of(one, two).combineAll()

        val produced = await(combined.toArray().toPromise())
        val expected = arrayOf(arrayOf(1, 2))

        expect(produced).toEqual(expected)
      }
    }
  }
}
