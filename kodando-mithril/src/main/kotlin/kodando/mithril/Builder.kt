package kodando.mithril

fun root(applier: Applier<Props>): VNode<*>? {
    val props = createProps(applier)

    return props.children.firstOrNull()
}

fun Props.addChild(vararg children: VNode<*>?) {
    if (this.children === undefined) {
        this.children = children
    } else {
        this.children += children
    }
}

fun <TViewProps : Props> Props.addChild(view: View<TViewProps>, applier: Applier<TViewProps>) {
    addChild(
        createElement(view, createProps(applier))
    )
}

fun Props.content(text: Any?) {
    addChild("$text".unsafeCast<VNode<Nothing>>())
}
