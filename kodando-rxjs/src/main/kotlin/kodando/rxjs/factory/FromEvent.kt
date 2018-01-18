package kodando.rxjs.factory

import kodando.rxjs.*
import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget

private val fromEvent_: JsFunction =
    from("rxjs/observable/fromEvent") import "fromEvent"


fun <T : Event> ObservableClass.fromEvent(target: EventTarget, eventName: String): Observable<T> {
    return fromEvent_.call(this, target, eventName)
}
