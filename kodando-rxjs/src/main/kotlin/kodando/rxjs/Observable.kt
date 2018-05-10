@file: JsModule("rxjs")

package kodando.rxjs

import kotlin.js.Promise

open external class Observable<out T>(creator: (Observer<T>) -> Unsubscribable?) {

    @JsName("subscribe")
    open fun subscribe(observer: Observer<T>): Unsubscribable

    @JsName("pipe")
    fun <R> pipe(operator: OperatorFunction<T, R>): Observable<R>

    @JsName("toPromise")
    fun toPromise(): Promise<T>

}
