package kodando.mithril

fun Props.content(text: Any?) {
    addChild("$text".unsafeCast<VNode<Nothing>>())
}