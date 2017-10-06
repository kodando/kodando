package kodando.react.dom

import kodando.react.dom.events.*

typealias DragEventHandler<TElement> = (DragEvent<TElement>) -> Unit
typealias KeyboardEventHandler<TElement> = (KeyboardEvent<TElement>) -> Unit
typealias FocusEventHandler<TElement> = (FocusEvent<TElement>) -> Unit
typealias FormEventHandler<TElement> = (FormEvent<TElement>) -> Unit
typealias MouseEventHandler<TElement> = (MouseEvent<TElement>) -> Unit
typealias TouchEventHandler<TElement> = (TouchEvent<TElement>) -> Unit
typealias UIEventHandler<TElement> = (UIEvent<TElement>) -> Unit
typealias WheelEventHandler<TElement> = (WheelEvent<TElement>) -> Unit
