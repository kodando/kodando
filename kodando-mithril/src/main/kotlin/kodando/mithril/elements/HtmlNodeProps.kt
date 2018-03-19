package kodando.mithril.elements

import kodando.mithril.EventHandlerWithArgument
import kodando.mithril.Props
import org.w3c.dom.events.Event
import org.w3c.dom.events.MouseEvent


external interface HtmlNodeProps : Props {
    var className: String?

    @JsName("oncopy")
    var onCopy: EventHandlerWithArgument<Event>?

    @JsName("oncut")
    var onCut: EventHandlerWithArgument<Event>?

    @JsName("onpaste")
    var onPaste: EventHandlerWithArgument<Event>?

    @JsName("onkeydown")
    var onKeyDown: EventHandlerWithArgument<Event>?

    @JsName("onkeypress")
    var onKeyPress: EventHandlerWithArgument<Event>?

    @JsName("onkeyup")
    var onKeyUp: EventHandlerWithArgument<Event>?

    @JsName("onfocus")
    var onFocus: EventHandlerWithArgument<Event>?

    @JsName("onblur")
    var onBlur: EventHandlerWithArgument<Event>?

    @JsName("onchange")
    var onChange: EventHandlerWithArgument<Event>?

    @JsName("oninput")
    var onInput: EventHandlerWithArgument<Event>?

    @JsName("onclick")
    var onClick: EventHandlerWithArgument<MouseEvent>?

    @JsName("ondoubleclick")
    var onDoubleClick: EventHandlerWithArgument<MouseEvent>?

    @JsName("ondrag")
    var onDrag: EventHandlerWithArgument<Event>?

    @JsName("ondragend")
    var onDragEnd: EventHandlerWithArgument<Event>?

    @JsName("ondragenter")
    var onDragEnter: EventHandlerWithArgument<Event>?

    @JsName("ondragexit")
    var onDragExit: EventHandlerWithArgument<Event>?

    @JsName("ondragleave")
    var onDragLeave: EventHandlerWithArgument<Event>?

    @JsName("ondragover")
    var onDragOver: EventHandlerWithArgument<Event>?

    @JsName("ondragstart")
    var onDragStart: EventHandlerWithArgument<Event>?

    @JsName("ondrop")
    var onDrop: EventHandlerWithArgument<Event>?

    @JsName("onmousedown")
    var onMouseDown: EventHandlerWithArgument<Event>?

    @JsName("onmouseenter")
    var onMouseEnter: EventHandlerWithArgument<Event>?

    @JsName("onmouseleave")
    var onMouseLeave: EventHandlerWithArgument<Event>?

    @JsName("onmousemove")
    var onMouseMove: EventHandlerWithArgument<Event>?

    @JsName("onmouseout")
    var onMouseOut: EventHandlerWithArgument<Event>?

    @JsName("onmouseover")
    var onMouseOver: EventHandlerWithArgument<Event>?

    @JsName("onmouseup")
    var onMouseUp: EventHandlerWithArgument<Event>?

    @JsName("ontouchcancel")
    var onTouchCancel: EventHandlerWithArgument<Event>?

    @JsName("ontouchend")
    var onTouchEnd: EventHandlerWithArgument<Event>?

    @JsName("ontouchmove")
    var onTouchMove: EventHandlerWithArgument<Event>?

    @JsName("ontouchstart")
    var onTouchStart: EventHandlerWithArgument<Event>?

    @JsName("onscroll")
    var onScroll: EventHandlerWithArgument<Event>?

    @JsName("onwheel")
    var onWheel: EventHandlerWithArgument<Event>?
}
