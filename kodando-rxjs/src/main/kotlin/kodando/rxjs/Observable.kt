@file: JsModule("rxjs/Observable")

package kodando.rxjs

import kotlin.js.Promise

open external class Observable<out T>(publisher: (Observer<T>) -> Unsubscribable?) {

    open fun subscribe(observer: Observer<T>): Unsubscribable
    
    fun toPromise(): Promise<T>

    companion object : ObservableClass {

        @JsName("create")
        fun <T> create(producer: (Observer<T>) -> Unit): Observable<T>

        @JsName("create")
        fun <T> createWithSubscription(producer: (Observer<T>) -> Unsubscribable): Observable<T>

    }
}

