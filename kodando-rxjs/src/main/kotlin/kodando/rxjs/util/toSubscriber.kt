@file: JsModule("rxjs/util")

package kodando.rxjs.util

import kodando.rxjs.MaybeObserverOrHandler
import kodando.rxjs.Subscriber

external fun <T> toSubscriber(maybeObserverOrHandler: MaybeObserverOrHandler<T>): Subscriber<T>
