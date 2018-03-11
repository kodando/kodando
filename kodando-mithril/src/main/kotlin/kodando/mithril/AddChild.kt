package kodando.mithril

fun Props.addChild(vararg children: VNode<*>) {
    if (this.children === undefined) {
        this.children = children
    } else {
        this.children += children
    }
}

fun <TViewProps : Props> Props.addChild(view: View<TViewProps>, applier: Applier<TViewProps>) {
    addChild(
        createElement(view, withProps(applier))
    )
}

