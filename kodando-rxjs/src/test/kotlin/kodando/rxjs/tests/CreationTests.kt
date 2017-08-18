package kodando.rxjs.tests

import kodando.jest.describe
import kodando.jest.expect
import kodando.jest.it
import kodando.runtime.async.asyncPromise
import kodando.runtime.async.await
import kodando.rxjs.Observable
import kodando.rxjs.take
import kodando.rxjs.toArray
import kodando.rxjs.toPromise
import org.w3c.dom.events.Event
import kotlin.browser.document
import kotlin.js.Promise

/**
 * Created by danfma on 03/05/17.
 */

object CreationTests {
    init {
        describe("Observable.create") {
            it("should be able to produce elements") {
                val observable = Observable.create<Int> { observer ->
                    observer.next(1)
                    observer.next(2)
                    observer.complete()
                }

                asyncPromise {
                    val produced = await(observable.toArray().toPromise())
                    val expected = arrayOf(1, 2)

                    expect(produced).toEqual(expected)
                }
            }
        }

        describe("Observable.createWithSubscription") {
            it("should be able to produce and unsubscribe after") {
                val source = Observable.of(1)

                val observable = Observable.createWithSubscription<Int> { observer ->
                    source.subscribe(observer)
                }

                asyncPromise {
                    val produced = await(observable.toArray().toPromise())
                    val expected = arrayOf(1)

                    expect(produced).toEqual(expected)
                }
            }
        }

        describe("Observable.empty") {
            it("should return nothing") {
                val observable = Observable.empty<Int>()

                asyncPromise {
                    val produced = await(observable.toArray().toPromise())

                    expect(produced.size).toBe(0)
                }
            }
        }

        describe("Observable.from(Promise)") {
            it("should return the promised value") {
                val observable = Observable.from(Promise.resolve(1))

                asyncPromise {
                    val produced = await(observable.toPromise())

                    expect(produced).toBe(1)
                }
            }
        }

        describe("Observable.fromPromise") {
            it("should return the promised value") {
                val observable = Observable.fromPromise(Promise.resolve(1))

                asyncPromise {
                    val produced = await(observable.toPromise())

                    expect(produced).toBe(1)
                }
            }
        }

        describe("Observable.from(Array)") {
            it("should return the array value") {
                val observable = Observable.from(arrayOf(1, 2))

                asyncPromise {
                    val produced = await(observable.toArray().toPromise())
                    val expected = arrayOf(1, 2)

                    expect(produced).toEqual(expected)
                }
            }
        }

        describe("Observable.from(Observable)") {
            it("should return the observable values") {
                val source = Observable.of(1)
                val observable = Observable.from(source)

                asyncPromise {
                    val produced = await(observable.toArray().toPromise())
                    val expected = arrayOf(1)

                    expect(produced).toEqual(expected)
                }
            }
        }

        describe("Observable.fromEvent") {
            it("should return the events of this target") {
                val click = document.createEvent("Event")

                click.initEvent("click", true, true)

                val source = document.createElement("div")
                val observable = Observable.fromEvent<Event>(source, "click")

                asyncPromise {
                    val promise = observable.take(1).toPromise()

                    source.dispatchEvent(click)

                    val produced = await(promise)
                    val expected = click

                    expect(produced).toBe(expected)
                }
            }
        }


    }
}

