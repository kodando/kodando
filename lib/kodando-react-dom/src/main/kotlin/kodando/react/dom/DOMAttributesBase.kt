@file:Suppress("UnsafeCastFromDynamic")

package kodando.react.dom

import kodando.react.ReactProps
import org.w3c.dom.Element

/**
 * Created by danfma on 02/06/2016.
 */

interface DOMAttributesBase : ReactProps


inline var DOMAttributesBase.className: String?
	get() = this.asDynamic().className
	set(value) {
		this.asDynamic().className = value
	}

inline var DOMAttributesBase.id: String?
	get() = this.asDynamic().id
	set(value) {
		this.asDynamic().id = value
	}

inline var DOMAttributesBase.dangerouslySetInnerHTML: DangerousHtml?
	get() = this.asDynamic().dangerouslySetInnerHTML
	set(value) {
		this.asDynamic().dangerouslySetInnerHTML = value
	}


inline var DOMAttributesBase.onCopy: DragEventHandler<Element>?
	get() = this.asDynamic().onCopy
	set(value) {
		this.asDynamic().onCopy = value
	}

inline var DOMAttributesBase.onCut: DragEventHandler<Element>?
	get() = this.asDynamic().onCut
	set(value) {
		this.asDynamic().onCut = value
	}

inline var DOMAttributesBase.onPaste: DragEventHandler<Element>?
	get() = this.asDynamic().onPaste
	set(value) {
		this.asDynamic().onPaste = value
	}

inline var DOMAttributesBase.onKeyDown: KeyboardEventHandler<Element>?
	get() = this.asDynamic().onKeyDown
	set(value) {
		this.asDynamic().onKeyDown = value
	}

inline var DOMAttributesBase.onKeyPress: KeyboardEventHandler<Element>?
	get() = this.asDynamic().onKeyPress
	set(value) {
		this.asDynamic().onKeyPress = value
	}

inline var DOMAttributesBase.onKeyUp: KeyboardEventHandler<Element>?
	get() = this.asDynamic().onKeyUp
	set(value) {
		this.asDynamic().onKeyUp = value
	}

inline var DOMAttributesBase.onFocus: FocusEventHandler<Element>?
	get() = this.asDynamic().onFocus
	set(value) {
		this.asDynamic().onFocus = value
	}

inline var DOMAttributesBase.onBlur: FocusEventHandler<Element>?
	get() = this.asDynamic().onBlur
	set(value) {
		this.asDynamic().onBlur = value
	}

inline var DOMAttributesBase.onChange: FormEventHandler<Element>?
	get() = this.asDynamic().onChange
	set(value) {
		this.asDynamic().onChange = value
	}

inline var DOMAttributesBase.onInput: FormEventHandler<Element>?
	get() = this.asDynamic().onInput
	set(value) {
		this.asDynamic().onInput = value
	}

inline var DOMAttributesBase.onSubmit: FormEventHandler<Element>?
	get() = this.asDynamic().onSubmit
	set(value) {
		this.asDynamic().onSubmit = value
	}

inline var DOMAttributesBase.onClick: MouseEventHandler<Element>?
	get() = this.asDynamic().onClick
	set(value) {
		this.asDynamic().onClick = value
	}

inline var DOMAttributesBase.onDoubleClick: MouseEventHandler<Element>?
	get() = this.asDynamic().onDoubleClick
	set(value) {
		this.asDynamic().onDoubleClick = value
	}

inline var DOMAttributesBase.onDrag: DragEventHandler<Element>?
	get() = this.asDynamic().onDrag
	set(value) {
		this.asDynamic().onDrag = value
	}

inline var DOMAttributesBase.onDragEnd: DragEventHandler<Element>?
	get() = this.asDynamic().onDragEnd
	set(value) {
		this.asDynamic().onDragEnd = value
	}

inline var DOMAttributesBase.onDragEnter: DragEventHandler<Element>?
	get() = this.asDynamic().onDragEnter
	set(value) {
		this.asDynamic().onDragEnter = value
	}

inline var DOMAttributesBase.onDragExit: DragEventHandler<Element>?
	get() = this.asDynamic().onDragExit
	set(value) {
		this.asDynamic().onDragExit = value
	}

inline var DOMAttributesBase.onDragLeave: DragEventHandler<Element>?
	get() = this.asDynamic().onDragLeave
	set(value) {
		this.asDynamic().onDragLeave = value
	}

inline var DOMAttributesBase.onDragOver: DragEventHandler<Element>?
	get() = this.asDynamic().onDragOver
	set(value) {
		this.asDynamic().onDragOver = value
	}

inline var DOMAttributesBase.onDragStart: DragEventHandler<Element>?
	get() = this.asDynamic().onDragStart
	set(value) {
		this.asDynamic().onDragStart = value
	}

inline var DOMAttributesBase.onDrop: DragEventHandler<Element>?
	get() = this.asDynamic().onDrop
	set(value) {
		this.asDynamic().onDrop = value
	}

inline var DOMAttributesBase.onMouseDown: MouseEventHandler<Element>?
	get() = this.asDynamic().onMouseDown
	set(value) {
		this.asDynamic().onMouseDown = value
	}

inline var DOMAttributesBase.onMouseEnter: MouseEventHandler<Element>?
	get() = this.asDynamic().onMouseEnter
	set(value) {
		this.asDynamic().onMouseEnter = value
	}

inline var DOMAttributesBase.onMouseLeave: MouseEventHandler<Element>?
	get() = this.asDynamic().onMouseLeave
	set(value) {
		this.asDynamic().onMouseLeave = value
	}

inline var DOMAttributesBase.onMouseMove: MouseEventHandler<Element>?
	get() = this.asDynamic().onMouseMove
	set(value) {
		this.asDynamic().onMouseMove = value
	}

inline var DOMAttributesBase.onMouseOut: MouseEventHandler<Element>?
	get() = this.asDynamic().onMouseOut
	set(value) {
		this.asDynamic().onMouseOut = value
	}

inline var DOMAttributesBase.onMouseOver: MouseEventHandler<Element>?
	get() = this.asDynamic().onMouseOver
	set(value) {
		this.asDynamic().onMouseOver = value
	}

inline var DOMAttributesBase.onMouseUp: MouseEventHandler<Element>?
	get() = this.asDynamic().onMouseUp
	set(value) {
		this.asDynamic().onMouseUp = value
	}

inline var DOMAttributesBase.onTouchCancel: TouchEventHandler<Element>?
	get() = this.asDynamic().onTouchCancel
	set(value) {
		this.asDynamic().onTouchCancel = value
	}

inline var DOMAttributesBase.onTouchEnd: TouchEventHandler<Element>?
	get() = this.asDynamic().onTouchEnd
	set(value) {
		this.asDynamic().onTouchEnd = value
	}

inline var DOMAttributesBase.onTouchMove: TouchEventHandler<Element>?
	get() = this.asDynamic().onTouchMove
	set(value) {
		this.asDynamic().onTouchMove = value
	}

inline var DOMAttributesBase.onTouchStart: TouchEventHandler<Element>?
	get() = this.asDynamic().onTouchStart
	set(value) {
		this.asDynamic().onTouchStart = value
	}

inline var DOMAttributesBase.onScroll: UIEventHandler<Element>?
	get() = this.asDynamic().onScroll
	set(value) {
		this.asDynamic().onScroll = value
	}

inline var DOMAttributesBase.onWheel: WheelEventHandler<Element>?
	get() = this.asDynamic().onWheel
	set(value) {
		this.asDynamic().onWheel = value
	}
