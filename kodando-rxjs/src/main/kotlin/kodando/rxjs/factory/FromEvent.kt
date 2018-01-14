package kodando.rxjs.factory

import kodando.rxjs.JsFunction
import kodando.rxjs.Observable
import kodando.rxjs.ObservableClass
import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget

@JsModule("rxjs/observable/fromEvent")
private external object FromEventModule {
    val fromEvent: JsFunction
}

@JsName("fromEvent")
fun <T : Event> ObservableClass.fromEvent(target: EventTarget, eventName: String): Observable<T> {
    return FromEventModule.fromEvent.call(this, target, eventName)
}
