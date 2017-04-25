@file:Suppress("UnsafeCastFromDynamic")

package kodando.react.dom

import kodando.react.ReactProps
import org.w3c.dom.Element

/**
 * Created by danfma on 02/06/2016.
 */

interface DOMAttributesProps : ReactProps {
    var className: String?

    var id: String?

    var dangerouslySetInnerHTML: DangerousHtml?

    var onCopy: DragEventHandler<Element>?

    var onCut: DragEventHandler<Element>?

    var onPaste: DragEventHandler<Element>?

    var onKeyDown: KeyboardEventHandler<Element>?

    var onKeyPress: KeyboardEventHandler<Element>?

    var onKeyUp: KeyboardEventHandler<Element>?

    var onFocus: FocusEventHandler<Element>?

    var onBlur: FocusEventHandler<Element>?

    var onChange: FormEventHandler<Element>?

    var onInput: FormEventHandler<Element>?

    var onSubmit: FormEventHandler<Element>?

    var onClick: MouseEventHandler<Element>?

    var onDoubleClick: MouseEventHandler<Element>?

    var onDrag: DragEventHandler<Element>?

    var onDragEnd: DragEventHandler<Element>?

    var onDragEnter: DragEventHandler<Element>?

    var onDragExit: DragEventHandler<Element>?

    var onDragLeave: DragEventHandler<Element>?

    var onDragOver: DragEventHandler<Element>?

    var onDragStart: DragEventHandler<Element>?

    var onDrop: DragEventHandler<Element>?

    var onMouseDown: MouseEventHandler<Element>?

    var onMouseEnter: MouseEventHandler<Element>?

    var onMouseLeave: MouseEventHandler<Element>?

    var onMouseMove: MouseEventHandler<Element>?

    var onMouseOut: MouseEventHandler<Element>?

    var onMouseOver: MouseEventHandler<Element>?

    var onMouseUp: MouseEventHandler<Element>?

    var onTouchCancel: TouchEventHandler<Element>?

    var onTouchEnd: TouchEventHandler<Element>?

    var onTouchMove: TouchEventHandler<Element>?

    var onTouchStart: TouchEventHandler<Element>?

    var onScroll: UIEventHandler<Element>?

    var onWheel: WheelEventHandler<Element>?

}
