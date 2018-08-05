package kodando.mithril

import org.w3c.dom.Element
import kotlin.js.*
import kotlin.reflect.KClass

external interface Props {
  var id: String?
  var ref: String?
  var key: String?
  var children: Array<out VNode<*>?>
}

external interface VNode<out TProps : Props> {
  val attrs: TProps?
  val children: Array<out VNode<*>>
  val dom: Element
  val state: Any?
}

external interface View<in TProps : Props> {
  fun view(vnode: VNode<TProps>): VNode<*>?
}

external interface OnInit<in TProps : Props> {
  @JsName("oninit")
  fun onInit(vnode: VNode<TProps>)
}

external interface OnCreate<in TProps : Props> {
  @JsName("oncreate")
  fun onCreate(vnode: VNode<TProps>)
}

external interface OnBeforeUpdate<in TProps : Props> {
  @JsName("onbeforeupdate")
  fun onBeforeUpdate(vnode: VNode<TProps>, oldVNode: VNode<TProps>): Boolean
}

external interface OnUpdate<in TProps : Props> {
  @JsName("onupdate")
  fun onUpdate(vnode: VNode<TProps>)
}

external interface OnBeforeRemove<in TProps : Props> {
  @JsName("onbeforeremove")
  fun onBeforeRemove(vnode: VNode<TProps>)
}

external interface OnBeforeRemoveAsync<in TProps : Props> {
  @JsName("onbeforeremove")
  fun onBeforeRemove(vnode: VNode<TProps>): Promise<*>
}

external interface OnRemove<in TProps : Props> {
  @JsName("onremove")
  fun onRemove(vnode: VNode<TProps>)
}

@JsModule("mithril")
private external object Mithril {
  fun render(element: Element, view: Any)
  fun mount(element: Element, view: View<*>)
  fun mount(element: Element, view: JsClass<out View<*>>)
  fun route(element: Element, defaultRoute: String, routes: Json)
  fun redraw()
}

@JsModule("mithril")
private external fun m(tag: String, children: Any?): VNode<*>

@JsModule("mithril")
private external fun m(tag: String, json: Props, children: Any?): VNode<*>

@JsModule("mithril")
private external fun m(view: View<*>, children: Any?): VNode<*>

@JsModule("mithril")
private external fun m(view: View<*>, json: Props, children: Any?): VNode<*>

@JsModule("mithril")
private external fun m(view: JsClass<out View<*>>, children: Any?): VNode<*>

@JsModule("mithril")
private external fun m(view: JsClass<out View<*>>, json: Props, children: Any?): VNode<*>

@JsModule("mithril")
private external fun m(child: VNode<*>, json: Props, children: Any?): VNode<*>

typealias VNodeFactory = (VNode<*>) -> VNode<*>

fun render(element: Element, view: Any) {
  Mithril.render(element, view)
}

fun mount(element: Element, view: View<*>) {
  Mithril.mount(element, view)
}

fun mount(element: Element, view: JsClass<out View<*>>) {
  Mithril.mount(element, view)
}

inline fun <TView : View<*>> mount(element: Element, view: KClass<TView>) {
  mount(element, view.js)
}

fun route(element: Element, defaultRoute: String, map: Map<String, View<*>>) {
  val routes = json(
    *map.map { (key, value) -> key to value }.toTypedArray()
  )

  Mithril.route(element, defaultRoute, routes)
}

fun redraw() {
  Mithril.redraw()
}

fun separateChildren(props: Props, children: Array<out Any?>): Pair<Props, Array<out Any?>> {
  if (props.children === undefined) {
    return props to children
  }

  lateinit var newProps: Props
  lateinit var composedChildren: Array<out Any?>

  js("""
      var addedChildren = props.children;

      newProps = Object.assign({}, props, {children:undefined});
      composedChildren = [].concat(addedChildren).concat(children);
  """)

  return newProps to composedChildren
}

fun createElement(tag: String, vararg children: Any?): VNode<*> {
  return m(tag, children)
}

fun <TProps : Props> createElement(tag: String, props: TProps, vararg children: Any?): VNode<*> {
  val (cleanProps, allChildren) = separateChildren(props, children)

  return m(tag, cleanProps, allChildren)
}

fun createElement(view: View<*>, vararg children: Any?): VNode<*> {
  return m(view, children)
}

fun <TProps : Props> createElement(view: View<TProps>, props: TProps, vararg children: Any?): VNode<*> {
  val (cleanProps, allChildren) = separateChildren(props, children)

  return m(view, cleanProps, allChildren)
}

fun createElement(viewClass: JsClass<out View<*>>, vararg children: Any?): VNode<*> {
  return m(viewClass, children)
}

fun <TProps : Props> createElement(viewClass: JsClass<out View<TProps>>, props: TProps, vararg children: Any?): VNode<*> {
  val (cleanProps, allChildren) = separateChildren(props, children)

  return m(viewClass, cleanProps, allChildren)
}

fun <TProps : Props> createElement(vnode: VNode<*>, props: TProps, vararg children: Any?): VNode<*> {
  val (cleanProps, allChildren) = separateChildren(props, children)

  return m(vnode, cleanProps, allChildren)
}
