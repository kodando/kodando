package kodando.mithril.routing

import kodando.history.History
import kodando.mithril.*
import kodando.mithril.context.contextConsumer
import kodando.mithril.elements.a
import org.w3c.dom.events.MouseEvent

external interface LinkProps : Props {
    var className: String?
    var onClick: EventHandler?
    var target: String?
    var replace: Boolean?
    var to: String
}

object LinkView : View<LinkProps> {
    override fun view(vnode: VNode<LinkProps>): VNode<*>? {
        val props = vnode.attrs ?: return null
        val className = props.className
        val children = vnode.children

        return root {
            contextConsumer(routerContextKey) { routerContext ->
                val history = routerContext.history
                val location = History.createLocation(props.to, null, null, history.location)
                val href: String = history.createHref(location)

                a {
                    if (className != null) {
                        this.className = className
                    }

                    this.href = href
                    this.onClick = handleClick(props, routerContext)
                    addChild(*children)
                }
            }
        }
    }

    private fun handleClick(props: LinkProps, routerContext: RouterContext): EventHandlerWithArgument<MouseEvent> = { event ->
        props.onClick?.invoke()

        if (shouldPresentDefault(event, props)) {
            event.preventDefault()

            val history = routerContext.history
            val replace = props.replace ?: false
            val to = props.to

            if (replace) {
                history.replace(to)
            } else {
                history.push(to)
            }
        }
    }

    private fun shouldPresentDefault(event: MouseEvent, props: LinkProps): Boolean {
        return !event.defaultPrevented
            && event.button == 0.toShort()
            && props.target != "_blank"
            && !isModifierEvent(event)
    }

    private fun isModifierEvent(event: MouseEvent): Boolean {
        return event.metaKey
            || event.altKey
            || event.ctrlKey
            || event.shiftKey
    }
}

fun Props.routeLink(applier: Applier<LinkProps>) {
    addChild(LinkView, applier)
}
