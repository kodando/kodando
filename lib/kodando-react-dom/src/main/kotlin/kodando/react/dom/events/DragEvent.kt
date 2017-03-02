package kodando.react.dom.events

import org.w3c.dom.DataTransfer
import org.w3c.dom.Element

external interface DragEvent<TElement : Element> : SyntheticEvent<TElement> {
	var dataTransfer: DataTransfer?
}