package kodando.rxjs.tests

import kodando.jest.Spec
import kodando.jest.expect
import kodando.runtime.async.await
import kodando.rxjs.Observable
import kodando.rxjs.factory.*
import kodando.rxjs.operator.combineAll
import kodando.rxjs.operator.take
import kodando.rxjs.operator.toArray
import org.w3c.dom.events.Event
import kotlin.browser.document
import kotlin.js.Promise

/**
 * Created by danfma on 03/05/17.
 */

object ObservableCreateSpec : Spec() {
    init {
        describe("Observable.create") {
            it("should be able to produce elements") byCheckingAfter {
                val observable = Observable.create<Int> { observer ->
                    observer.next(1)
                    observer.next(2)
                    observer.complete()
                }

                val produced = await(observable.toArray().toPromise())
                val expected = arrayOf(1, 2)

                expect(produced).toEqual(expected)
            }
        }

        describe("Observable.createWithSubscription") {
            it("should be able to produce and unsubscribe after") byCheckingAfter {
                val source = Observable.of(1)

                val observable = Observable.createWithSubscription<Int> { observer ->
                    source.subscribe(observer)
                }

                val produced = await(observable.toArray().toPromise())
                val expected = arrayOf(1)

                expect(produced).toEqual(expected)
            }
        }



        describe("Observable.fromPromise") {
            it("should return the promised value") byCheckingAfter {
                val observable = Observable.fromPromise(Promise.resolve(1))

                val produced = await(observable.toPromise())

                expect(produced).toBe(1)
            }
        }

        describe("Observable.fromEvent") {
            it("should return the events of this target") byCheckingAfter {
                val click = document.createEvent("Event")

                click.initEvent("click", true, true)

                val source = document.createElement("div")
                val observable = Observable.fromEvent<Event>(source, "click")

                val promise = observable.take(1).toPromise()

                source.dispatchEvent(click)

                val produced = await(promise)
                val expected = click

                expect(produced).toBe(expected)
            }
        }

        describe("Observable.combineAll") {
            it("should combine the observables into all") byCheckingAfter {
                val one = Observable.of(1)
                val two = Observable.of(2)
                val combined = Observable.of(one, two).combineAll()

                val produced = await(combined.toArray().toPromise())
                val expected = arrayOf(arrayOf(1, 2))

                expect(produced).toEqual(expected)
            }
        }
    }
}
