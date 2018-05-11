@file:Suppress("unused", "UNUSED_PARAMETER")

package kodando.react.dom

import kodando.react.*
import org.w3c.dom.Element


@JsName("addElement")
private fun <TElement : HtmlNodeProps<*>> ReactProps.addElement(
  tagName: String,
  className: String,
  props: TElement,
  configurer: Configurer<TElement>?) {

  if (tagName.isNotEmpty()) {
    props.className = className
  }

  if (configurer != null) {
    props.configurer()
  }

  add(createElement(tagName, props))
}

@JsName("a")
fun ReactProps.a(className: String = "", props: HtmlAnchorElementProps = createProps(), configurer: Configurer<HtmlAnchorElementProps>? = null) {
  addElement("a", className, props, configurer)
}

@JsName("abbr")
fun ReactProps.abbr(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("abbr", className, props, configurer)
}

@JsName("address")
fun ReactProps.address(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("address", className, props, configurer)
}

@JsName("area")
fun ReactProps.area(className: String = "", props: HtmlAreaElementProps = createProps(), configurer: Configurer<HtmlAreaElementProps>? = null) {
  addElement("area", className, props, configurer)
}

@JsName("article")
fun ReactProps.article(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("article", className, props, configurer)
}

@JsName("aside")
fun ReactProps.aside(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("aside", className, props, configurer)
}

@JsName("audio")
fun ReactProps.audio(className: String = "", props: HtmlAudioElementProps = createProps(), configurer: Configurer<HtmlAudioElementProps>? = null) {
  addElement("audio", className, props, configurer)
}

@JsName("b")
fun ReactProps.b(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("b", className, props, configurer)
}

@JsName("base")
fun ReactProps.base(className: String = "", props: HtmlBaseElementProps = createProps(), configurer: Configurer<HtmlBaseElementProps>? = null) {
  addElement("base", className, props, configurer)
}

@JsName("bdi")
fun ReactProps.bdi(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("bdi", className, props, configurer)
}

@JsName("bdo")
fun ReactProps.bdo(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("bdo", className, props, configurer)
}

@JsName("big")
fun ReactProps.big(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("big", className, props, configurer)
}

@JsName("blockquote")
fun ReactProps.blockquote(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("blockquote", className, props, configurer)
}

@JsName("body")
fun ReactProps.body(className: String = "", props: HtmlBodyElementProps = createProps(), configurer: Configurer<HtmlBodyElementProps>? = null) {
  addElement("body", className, props, configurer)
}

@JsName("br")
fun ReactProps.br(className: String = "", props: HtmlBrElementProps = createProps(), configurer: Configurer<HtmlBrElementProps>? = null) {
  addElement("br", className, props, configurer)
}

@JsName("button")
fun ReactProps.button(className: String = "", props: HtmlButtonElementProps = createProps(), configurer: Configurer<HtmlButtonElementProps>? = null) {
  addElement("button", className, props, configurer)
}

@JsName("canvas")
fun ReactProps.canvas(className: String = "", props: HtmlCanvasElementProps = createProps(), configurer: Configurer<HtmlCanvasElementProps>? = null) {
  addElement("canvas", className, props, configurer)
}

@JsName("caption")
fun ReactProps.caption(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("caption", className, props, configurer)
}

@JsName("cite")
fun ReactProps.cite(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("cite", className, props, configurer)
}

@JsName("code")
fun ReactProps.code(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("code", className, props, configurer)
}

@JsName("col")
fun ReactProps.col(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("col", className, props, configurer)
}

@JsName("colgroup")
fun ReactProps.colgroup(className: String = "", props: HtmlTableColElementProps = createProps(), configurer: Configurer<HtmlTableColElementProps>? = null) {
  addElement("colgroup", className, props, configurer)
}

@JsName("data")
fun ReactProps.data(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("data", className, props, configurer)
}

@JsName("datalist")
fun ReactProps.datalist(className: String = "", props: HtmlDataListElementProps = createProps(), configurer: Configurer<HtmlDataListElementProps>? = null) {
  addElement("datalist", className, props, configurer)
}

@JsName("dd")
fun ReactProps.dd(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("dd", className, props, configurer)
}

@JsName("del")
fun ReactProps.del(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("del", className, props, configurer)
}

@JsName("details")
fun ReactProps.details(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("details", className, props, configurer)
}

@JsName("dfn")
fun ReactProps.dfn(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("dfn", className, props, configurer)
}

@JsName("dialog")
fun ReactProps.dialog(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("dialog", className, props, configurer)
}

@JsName("div")
fun ReactProps.div(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("div", className, props, configurer)
}

@JsName("dl")
fun ReactProps.dl(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("dl", className, props, configurer)
}

@JsName("dt")
fun ReactProps.dt(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("dt", className, props, configurer)
}

@JsName("em")
fun ReactProps.em(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("em", className, props, configurer)
}

@JsName("embed")
fun ReactProps.embed(className: String = "", props: HtmlEmbedElementProps = createProps(), configurer: Configurer<HtmlEmbedElementProps>? = null) {
  addElement("embed", className, props, configurer)
}

@JsName("fieldset")
fun ReactProps.fieldset(className: String = "", props: HtmlFieldSetElementProps = createProps(), configurer: Configurer<HtmlFieldSetElementProps>? = null) {
  addElement("fieldset", className, props, configurer)
}

@JsName("figcaption")
fun ReactProps.figcaption(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("figcaption", className, props, configurer)
}

@JsName("figure")
fun ReactProps.figure(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("figure", className, props, configurer)
}

@JsName("footer")
fun ReactProps.footer(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("footer", className, props, configurer)
}

@JsName("form")
fun ReactProps.form(className: String = "", props: HtmlFormElementProps = createProps(), configurer: Configurer<HtmlFormElementProps>? = null) {
  addElement("form", className, props, configurer)
}

@JsName("h1")
fun ReactProps.h1(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("h1", className, props, configurer)
}

@JsName("h2")
fun ReactProps.h2(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("h2", className, props, configurer)
}

@JsName("h3")
fun ReactProps.h3(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("h3", className, props, configurer)
}

@JsName("h4")
fun ReactProps.h4(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("h4", className, props, configurer)
}

@JsName("h5")
fun ReactProps.h5(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("h5", className, props, configurer)
}

@JsName("h6")
fun ReactProps.h6(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("h6", className, props, configurer)
}

@JsName("head")
fun ReactProps.head(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("head", className, props, configurer)
}

@JsName("header")
fun ReactProps.header(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("header", className, props, configurer)
}

@JsName("hgroup")
fun ReactProps.hgroup(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("hgroup", className, props, configurer)
}

@JsName("hr")
fun ReactProps.hr(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("hr", className, props, configurer)
}

@JsName("html")
fun ReactProps.html(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("html", className, props, configurer)
}

@JsName("i")
fun ReactProps.i(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("i", className, props, configurer)
}

@JsName("iframe")
fun ReactProps.iframe(className: String = "", props: HtmlIFrameElementProps = createProps(), configurer: Configurer<HtmlIFrameElementProps>? = null) {
  addElement("iframe", className, props, configurer)
}

@JsName("img")
fun ReactProps.img(className: String = "", props: HtmlImageElementProps = createProps(), configurer: Configurer<HtmlImageElementProps>? = null) {
  addElement("img", className, props, configurer)
}

@JsName("input")
fun ReactProps.input(className: String = "", props: HtmlInputElementProps = createProps(), configurer: Configurer<HtmlInputElementProps>? = null) {
  addElement("input", className, props, configurer)
}

@JsName("ins")
fun ReactProps.ins(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("ins", className, props, configurer)
}

@JsName("kbd")
fun ReactProps.kbd(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("kbd", className, props, configurer)
}

@JsName("keygen")
fun ReactProps.keygen(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("keygen", className, props, configurer)
}

@JsName("label")
fun ReactProps.label(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("label", className, props, configurer)
}

@JsName("legend")
fun ReactProps.legend(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("legend", className, props, configurer)
}

@JsName("li")
fun ReactProps.li(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("li", className, props, configurer)
}

@JsName("link")
fun ReactProps.link(className: String = "", props: HtmlLinkElementProps = createProps(), configurer: Configurer<HtmlLinkElementProps>? = null) {
  addElement("link", className, props, configurer)
}

@JsName("main")
fun ReactProps.main(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("main", className, props, configurer)
}

@JsName("map")
fun ReactProps.map(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("map", className, props, configurer)
}

@JsName("mark")
fun ReactProps.mark(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("mark", className, props, configurer)
}

@JsName("menu")
fun ReactProps.menu(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("menu", className, props, configurer)
}

@JsName("menuitem")
fun ReactProps.menuitem(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("menuitem", className, props, configurer)
}

@JsName("meta")
fun ReactProps.meta(className: String = "", props: HtmlMetaElementProps = createProps(), configurer: Configurer<HtmlMetaElementProps>? = null) {
  addElement("meta", className, props, configurer)
}

@JsName("meter")
fun ReactProps.meter(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("meter", className, props, configurer)
}

@JsName("nav")
fun ReactProps.nav(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("nav", className, props, configurer)
}

@JsName("noscript")
fun ReactProps.noscript(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("noscript", className, props, configurer)
}

@JsName("objectTag")
fun ReactProps.objectTag(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("objectTag", className, props, configurer)
}

@JsName("ol")
fun ReactProps.ol(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("ol", className, props, configurer)
}

@JsName("optgroup")
fun ReactProps.optgroup(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("optgroup", className, props, configurer)
}

@JsName("option")
fun ReactProps.option(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("option", className, props, configurer)
}

@JsName("output")
fun ReactProps.output(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("output", className, props, configurer)
}

@JsName("p")
fun ReactProps.p(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("p", className, props, configurer)
}

@JsName("param")
fun ReactProps.param(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("param", className, props, configurer)
}

@JsName("picture")
fun ReactProps.picture(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("picture", className, props, configurer)
}

@JsName("pre")
fun ReactProps.pre(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("pre", className, props, configurer)
}

@JsName("progress")
fun ReactProps.progress(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("progress", className, props, configurer)
}

@JsName("q")
fun ReactProps.q(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("q", className, props, configurer)
}

@JsName("rp")
fun ReactProps.rp(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("rp", className, props, configurer)
}

@JsName("rt")
fun ReactProps.rt(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("rt", className, props, configurer)
}

@JsName("ruby")
fun ReactProps.ruby(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("ruby", className, props, configurer)
}

@JsName("s")
fun ReactProps.s(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("s", className, props, configurer)
}

@JsName("samp")
fun ReactProps.samp(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("samp", className, props, configurer)
}

@JsName("script")
fun ReactProps.script(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("script", className, props, configurer)
}

@JsName("section")
fun ReactProps.section(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("section", className, props, configurer)
}

@JsName("select")
fun ReactProps.select(className: String = "", props: HtmlSelectElementProps = createProps(), configurer: Configurer<HtmlSelectElementProps>? = null) {
  addElement("select", className, props, configurer)
}

@JsName("small")
fun ReactProps.small(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("small", className, props, configurer)
}

@JsName("source")
fun ReactProps.source(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("source", className, props, configurer)
}

@JsName("span")
fun ReactProps.span(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("span", className, props, configurer)
}

@JsName("strong")
fun ReactProps.strong(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("strong", className, props, configurer)
}

@JsName("style")
fun ReactProps.style(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("style", className, props, configurer)
}

@JsName("sub")
fun ReactProps.sub(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("sub", className, props, configurer)
}

@JsName("summary")
fun ReactProps.summary(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("summary", className, props, configurer)
}

@JsName("sup")
fun ReactProps.sup(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("sup", className, props, configurer)
}

@JsName("table")
fun ReactProps.table(className: String = "", props: HtmlTableElementProps = createProps(), configurer: Configurer<HtmlTableElementProps>? = null) {
  addElement("table", className, props, configurer)
}

@JsName("tbody")
fun ReactProps.tbody(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("tbody", className, props, configurer)
}

@JsName("td")
fun ReactProps.td(className: String = "", props: HtmlTableColElementProps = createProps(), configurer: Configurer<HtmlTableColElementProps>? = null) {
  addElement("td", className, props, configurer)
}

@JsName("textarea")
fun ReactProps.textarea(className: String = "", props: HtmlTextAreaElementProps = createProps(), configurer: Configurer<HtmlTextAreaElementProps>? = null) {
  addElement("textarea", className, props, configurer)
}

@JsName("tfoot")
fun ReactProps.tfoot(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("tfoot", className, props, configurer)
}

@JsName("th")
fun ReactProps.th(className: String = "", props: HtmlTableColElementProps = createProps(), configurer: Configurer<HtmlTableColElementProps>? = null) {
  addElement("th", className, props, configurer)
}

@JsName("thead")
fun ReactProps.thead(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("thead", className, props, configurer)
}

@JsName("time")
fun ReactProps.time(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("time", className, props, configurer)
}

@JsName("title")
fun ReactProps.title(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("title", className, props, configurer)
}

@JsName("tr")
fun ReactProps.tr(className: String = "", props: HtmlTableRowElementProps = createProps(), configurer: Configurer<HtmlTableRowElementProps>? = null) {
  addElement("tr", className, props, configurer)
}

@JsName("track")
fun ReactProps.track(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("track", className, props, configurer)
}

@JsName("u")
fun ReactProps.u(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("u", className, props, configurer)
}

@JsName("ul")
fun ReactProps.ul(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("ul", className, props, configurer)
}

@JsName("variable")
fun ReactProps.variable(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("variable", className, props, configurer)
}

@JsName("video")
fun ReactProps.video(className: String = "", props: HtmlVideoElementProps = createProps(), configurer: Configurer<HtmlVideoElementProps>? = null) {
  addElement("video", className, props, configurer)
}

@JsName("wbr")
fun ReactProps.wbr(className: String = "", props: HtmlElementProps<out Element> = createProps(), configurer: Configurer<HtmlElementProps<out Element>>? = null) {
  addElement("wbr", className, props, configurer)
}

// SVG
@JsName("svg")
fun ReactProps.svg(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("svg", className, props, configurer)
}

@JsName("circle")
fun ReactProps.circle(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("circle", className, props, configurer)
}

@JsName("defs")
fun ReactProps.defs(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("defs", className, props, configurer)
}

@JsName("ellipse")
fun ReactProps.ellipse(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("ellipse", className, props, configurer)
}

@JsName("g")
fun ReactProps.g(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("g", className, props, configurer)
}

@JsName("image")
fun ReactProps.image(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("image", className, props, configurer)
}

@JsName("line")
fun ReactProps.line(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("line", className, props, configurer)
}

@JsName("linearGradient")
fun ReactProps.linearGradient(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("linearGradient", className, props, configurer)
}

@JsName("mask")
fun ReactProps.mask(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("mask", className, props, configurer)
}

@JsName("path")
fun ReactProps.path(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("path", className, props, configurer)
}

@JsName("pattern")
fun ReactProps.pattern(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("pattern", className, props, configurer)
}

@JsName("polygon")
fun ReactProps.polygon(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("polygon", className, props, configurer)
}

@JsName("polyline")
fun ReactProps.polyline(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("polyline", className, props, configurer)
}

@JsName("radialGradient")
fun ReactProps.radialGradient(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("radialGradient", className, props, configurer)
}

@JsName("rect")
fun ReactProps.rect(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("rect", className, props, configurer)
}

@JsName("stop")
fun ReactProps.stop(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("stop", className, props, configurer)
}

@JsName("symbol")
fun ReactProps.symbol(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("symbol", className, props, configurer)
}

@JsName("text")
fun ReactProps.text(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("text", className, props, configurer)
}

@JsName("tspan")
fun ReactProps.tspan(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("tspan", className, props, configurer)
}

@JsName("use")
fun ReactProps.use(className: String = "", props: SVGElementProps = createProps(), configurer: Configurer<SVGElementProps>? = null) {
  addElement("use", className, props, configurer)
}
