@file:Suppress("UnsafeCastFromDynamic")

package kodando.react.dom

import kodando.react.ReactProps
import org.w3c.dom.Element

/**
 * Created by danfma on 02/06/2016.
 */

open class DOMAttributesProps : ReactProps() {
    var className: String? by jsonProperty

    var id: String? by jsonProperty

    var dangerouslySetInnerHTML: DangerousHtml? by jsonProperty

    var onCopy: DragEventHandler<Element>? by jsonProperty

    var onCut: DragEventHandler<Element>? by jsonProperty

    var onPaste: DragEventHandler<Element>? by jsonProperty

    var onKeyDown: KeyboardEventHandler<Element>? by jsonProperty

    var onKeyPress: KeyboardEventHandler<Element>? by jsonProperty

    var onKeyUp: KeyboardEventHandler<Element>? by jsonProperty

    var onFocus: FocusEventHandler<Element>? by jsonProperty

    var onBlur: FocusEventHandler<Element>? by jsonProperty

    var onChange: FormEventHandler<Element>? by jsonProperty

    var onInput: FormEventHandler<Element>? by jsonProperty

    var onSubmit: FormEventHandler<Element>? by jsonProperty

    var onClick: MouseEventHandler<Element>? by jsonProperty

    var onDoubleClick: MouseEventHandler<Element>? by jsonProperty

    var onDrag: DragEventHandler<Element>? by jsonProperty

    var onDragEnd: DragEventHandler<Element>? by jsonProperty

    var onDragEnter: DragEventHandler<Element>? by jsonProperty

    var onDragExit: DragEventHandler<Element>? by jsonProperty

    var onDragLeave: DragEventHandler<Element>? by jsonProperty

    var onDragOver: DragEventHandler<Element>? by jsonProperty

    var onDragStart: DragEventHandler<Element>? by jsonProperty

    var onDrop: DragEventHandler<Element>? by jsonProperty

    var onMouseDown: MouseEventHandler<Element>? by jsonProperty

    var onMouseEnter: MouseEventHandler<Element>? by jsonProperty

    var onMouseLeave: MouseEventHandler<Element>? by jsonProperty

    var onMouseMove: MouseEventHandler<Element>? by jsonProperty

    var onMouseOut: MouseEventHandler<Element>? by jsonProperty

    var onMouseOver: MouseEventHandler<Element>? by jsonProperty

    var onMouseUp: MouseEventHandler<Element>? by jsonProperty

    var onTouchCancel: TouchEventHandler<Element>? by jsonProperty

    var onTouchEnd: TouchEventHandler<Element>? by jsonProperty

    var onTouchMove: TouchEventHandler<Element>? by jsonProperty

    var onTouchStart: TouchEventHandler<Element>? by jsonProperty

    var onScroll: UIEventHandler<Element>? by jsonProperty

    var onWheel: WheelEventHandler<Element>? by jsonProperty

}
