@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs

import kodando.rxjs.operators.tap

inline fun <T> Observable<T>.subscribe(observer: Observer<T>): Unsubscribable {
    return this.asDynamic().subscribe(observer)
}

inline fun <T> Observable<T>.subscribe(observer: ObserverLike<T>): Unsubscribable {
    return this.asDynamic().subscribe(observer)
}

inline fun <T> Observable<T>.subscribeBy(
    noinline next: NextHandler<T>? = undefined,
    noinline error: ErrorHandler? = undefined,
    noinline complete: CompleteHandler? = undefined): Unsubscribable {
    return this.asDynamic().subscribe(next, error, complete)
}

inline fun <T> Observable<T>.subscribeNext(noinline next: NextHandler<T>): Unsubscribable {
    return subscribeBy(next = next)
}

inline fun <T> Observable<T>.subscribeWith(configurer: ObserverLike<T>.() -> Unit): Unsubscribable {
    return subscribe(createObserverLike<T>().also(configurer))
}

inline fun <T> Observable<T>.tapWith(configurer: ObserverLike<T>.() -> Unit): Observable<T> {
    return this.tap(createObserverLike<T>().also(configurer))
}

inline fun <T> Observable<T>.tapNext(noinline next: NextHandler<T>): Observable<T> {
    return this.tap(next = next)
}
