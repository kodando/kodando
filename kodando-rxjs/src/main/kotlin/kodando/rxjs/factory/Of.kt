package kodando.rxjs.factory

import kodando.rxjs.*

private val of_: JsFunction =
    from("rxjs/observable/of") import "of"


fun <T> ObservableClass.of(vararg values: T): Observable<T> {
    return of_.apply(this, values)
}
