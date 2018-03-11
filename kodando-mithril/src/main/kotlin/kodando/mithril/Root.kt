package kodando.mithril

fun root(applier: Applier<Props>): VNode<*> {
    val props = withProps(applier)

    return props.children.firstOrNull() ?: throw Error("You should specify at least one element")
}
