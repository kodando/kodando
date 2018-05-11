package kodando.rxjs.observable

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.fromModule
import kodando.rxjs.import
import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget

private val fromEvent_: JsFunction =
  fromModule("rxjs") import "fromEvent"


fun <T : Event> fromEvent(target: EventTarget, eventName: String): Observable<T> {
  return fromEvent_.call(null, target, eventName)
}
