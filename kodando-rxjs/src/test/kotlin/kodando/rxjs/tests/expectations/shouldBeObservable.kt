package kodando.rxjs.tests.expectations

import kodando.jest.expect
import kodando.rxjs.Observable

fun Any.shouldBeObservable() {
    expect(this is Observable<*>).toBeTruthy()
}
