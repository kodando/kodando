package kodando.rxjs.operator

import kodando.rxjs.*


private val bufferTime_: JsFunction =
    from("rxjs/operators/bufferTime") import "bufferTime"


fun <T> Observable<T>.bufferTime(bufferSize: Int, scheduler: Scheduler? = null): Observable<Array<T>> {
    return pipe(bufferTime_.call(this, bufferSize, scheduler))
}

fun <T> Observable<T>.bufferTime(bufferSize: Int, bufferCreationInterval: Int, scheduler: Scheduler? = null): Observable<Array<T>> {
    return pipe(bufferTime_.call(this, bufferSize, bufferCreationInterval, scheduler))
}

fun <T> Observable<T>.bufferTime(bufferSize: Int, bufferCreationInterval: Int, maxBufferSize: Int, scheduler: Scheduler? = null): Observable<Array<T>> {
    return pipe(bufferTime_.call(this, bufferSize, bufferCreationInterval, maxBufferSize, scheduler))
}
