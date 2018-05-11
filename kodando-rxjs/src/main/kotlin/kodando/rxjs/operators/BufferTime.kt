package kodando.rxjs.operators

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import
import kodando.rxjs.scheduler.Scheduler


private val bufferTime_: JsFunction =
  fromModule("rxjs/operators") import "bufferTime"


fun <T> Observable<T>.bufferTime(bufferSize: Int, scheduler: Scheduler? = null): Observable<Array<T>> {
  return pipe(bufferTime_.call(this, bufferSize, scheduler))
}

fun <T> Observable<T>.bufferTime(bufferSize: Int, bufferCreationInterval: Int, scheduler: Scheduler? = null): Observable<Array<T>> {
  return pipe(bufferTime_.call(this, bufferSize, bufferCreationInterval, scheduler))
}

fun <T> Observable<T>.bufferTime(bufferSize: Int, bufferCreationInterval: Int, maxBufferSize: Int, scheduler: Scheduler? = null): Observable<Array<T>> {
  return pipe(bufferTime_.call(this, bufferSize, bufferCreationInterval, maxBufferSize, scheduler))
}
