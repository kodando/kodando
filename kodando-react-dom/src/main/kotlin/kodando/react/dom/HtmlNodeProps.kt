package kodando.react.dom

import kodando.react.ReactProps
import org.w3c.dom.Node


external interface HtmlNodeProps<TNode : Node> : ReactProps {
  var className: String?

  var id: String?

  var dangerouslySetInnerHTML: DangerousHtml?

  var onCopy: DragEventHandler<TNode>?

  var onCut: DragEventHandler<TNode>?

  var onPaste: DragEventHandler<TNode>?

  var onKeyDown: KeyboardEventHandler<TNode>?

  var onKeyPress: KeyboardEventHandler<TNode>?

  var onKeyUp: KeyboardEventHandler<TNode>?

  var onFocus: FocusEventHandler<TNode>?

  var onBlur: FocusEventHandler<TNode>?

  var onChange: FormEventHandler<TNode>?

  var onInput: FormEventHandler<TNode>?

  var onSubmit: FormEventHandler<TNode>?

  var onClick: MouseEventHandler<TNode>?

  var onDoubleClick: MouseEventHandler<TNode>?

  var onDrag: DragEventHandler<TNode>?

  var onDragEnd: DragEventHandler<TNode>?

  var onDragEnter: DragEventHandler<TNode>?

  var onDragExit: DragEventHandler<TNode>?

  var onDragLeave: DragEventHandler<TNode>?

  var onDragOver: DragEventHandler<TNode>?

  var onDragStart: DragEventHandler<TNode>?

  var onDrop: DragEventHandler<TNode>?

  var onMouseDown: MouseEventHandler<TNode>?

  var onMouseEnter: MouseEventHandler<TNode>?

  var onMouseLeave: MouseEventHandler<TNode>?

  var onMouseMove: MouseEventHandler<TNode>?

  var onMouseOut: MouseEventHandler<TNode>?

  var onMouseOver: MouseEventHandler<TNode>?

  var onMouseUp: MouseEventHandler<TNode>?

  var onTouchCancel: TouchEventHandler<TNode>?

  var onTouchEnd: TouchEventHandler<TNode>?

  var onTouchMove: TouchEventHandler<TNode>?

  var onTouchStart: TouchEventHandler<TNode>?

  var onScroll: UIEventHandler<TNode>?

  var onWheel: WheelEventHandler<TNode>?
}
