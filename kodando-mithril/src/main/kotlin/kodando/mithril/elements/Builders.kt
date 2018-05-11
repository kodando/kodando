package kodando.mithril.elements

import kodando.mithril.*

private fun <T : Props> Props.addTag(name: String, applier: Applier<T>) {
  addChild(
    createElement(name, createProps(applier))
  )
}

fun <T : HtmlNodeProps> withClassName(
  className: String?,
  applier: Applier<T>): Applier<T> = {

  if (className != null) {
    this.className = className
  }

  applier()
}

@JsName("a")
fun Props.a(className: String? = null, applier: Applier<HtmlAnchorElementProps>) {
  addTag("a", withClassName(className, applier))
}

@JsName("abbr")
fun Props.abbr(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("abbr", withClassName(className, applier))
}

@JsName("address")
fun Props.address(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("address", withClassName(className, applier))
}

@JsName("area")
fun Props.area(className: String? = null, applier: Applier<HtmlAreaElementProps>) {
  addTag("area", withClassName(className, applier))
}

@JsName("article")
fun Props.article(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("article", withClassName(className, applier))
}

@JsName("aside")
fun Props.aside(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("aside", withClassName(className, applier))
}

@JsName("audio")
fun Props.audio(className: String? = null, applier: Applier<HtmlAudioElementProps>) {
  addTag("audio", withClassName(className, applier))
}

@JsName("b")
fun Props.b(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("b", withClassName(className, applier))
}

@JsName("base")
fun Props.base(className: String? = null, applier: Applier<HtmlBaseElementProps>) {
  addTag("base", withClassName(className, applier))
}

@JsName("bdi")
fun Props.bdi(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("bdi", withClassName(className, applier))
}

@JsName("bdo")
fun Props.bdo(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("bdo", withClassName(className, applier))
}

@JsName("big")
fun Props.big(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("big", withClassName(className, applier))
}

@JsName("blockquote")
fun Props.blockquote(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("blockquote", withClassName(className, applier))
}

@JsName("body")
fun Props.body(className: String? = null, applier: Applier<HtmlBodyElementProps>) {
  addTag("body", withClassName(className, applier))
}

@JsName("br")
fun Props.br(className: String? = null, applier: Applier<HtmlBrElementProps>) {
  addTag("br", withClassName(className, applier))
}

@JsName("button")
fun Props.button(className: String? = null, applier: Applier<HtmlButtonElementProps>) {
  addTag("button", withClassName(className, applier))
}

@JsName("canvas")
fun Props.canvas(className: String? = null, applier: Applier<HtmlCanvasElementProps>) {
  addTag("canvas", withClassName(className, applier))
}

@JsName("caption")
fun Props.caption(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("caption", withClassName(className, applier))
}

@JsName("cite")
fun Props.cite(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("cite", withClassName(className, applier))
}

@JsName("code")
fun Props.code(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("code", withClassName(className, applier))
}

@JsName("col")
fun Props.col(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("col", withClassName(className, applier))
}

@JsName("colgroup")
fun Props.colgroup(className: String? = null, applier: Applier<HtmlTableColElementProps>) {
  addTag("colgroup", withClassName(className, applier))
}

@JsName("data")
fun Props.data(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("data", withClassName(className, applier))
}

@JsName("datalist")
fun Props.datalist(className: String? = null, applier: Applier<HtmlDataListElementProps>) {
  addTag("datalist", withClassName(className, applier))
}

@JsName("dd")
fun Props.dd(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("dd", withClassName(className, applier))
}

@JsName("del")
fun Props.del(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("del", withClassName(className, applier))
}

@JsName("details")
fun Props.details(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("details", withClassName(className, applier))
}

@JsName("dfn")
fun Props.dfn(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("dfn", withClassName(className, applier))
}

@JsName("dialog")
fun Props.dialog(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("dialog", withClassName(className, applier))
}

@JsName("div")
fun Props.div(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("div", withClassName(className, applier))
}

@JsName("dl")
fun Props.dl(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("dl", withClassName(className, applier))
}

@JsName("dt")
fun Props.dt(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("dt", withClassName(className, applier))
}

@JsName("em")
fun Props.em(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("em", withClassName(className, applier))
}

@JsName("embed")
fun Props.embed(className: String? = null, applier: Applier<HtmlEmbedElementProps>) {
  addTag("embed", withClassName(className, applier))
}

@JsName("fieldset")
fun Props.fieldset(className: String? = null, applier: Applier<HtmlFieldSetElementProps>) {
  addTag("fieldset", withClassName(className, applier))
}

@JsName("figcaption")
fun Props.figcaption(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("figcaption", withClassName(className, applier))
}

@JsName("figure")
fun Props.figure(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("figure", withClassName(className, applier))
}

@JsName("footer")
fun Props.footer(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("footer", withClassName(className, applier))
}

@JsName("form")
fun Props.form(className: String? = null, applier: Applier<HtmlFormElementProps>) {
  addTag("form", withClassName(className, applier))
}

@JsName("h1")
fun Props.h1(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("h1", withClassName(className, applier))
}

@JsName("h2")
fun Props.h2(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("h2", withClassName(className, applier))
}

@JsName("h3")
fun Props.h3(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("h3", withClassName(className, applier))
}

@JsName("h4")
fun Props.h4(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("h4", withClassName(className, applier))
}

@JsName("h5")
fun Props.h5(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("h5", withClassName(className, applier))
}

@JsName("h6")
fun Props.h6(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("h6", withClassName(className, applier))
}

@JsName("head")
fun Props.head(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("head", withClassName(className, applier))
}

@JsName("header")
fun Props.header(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("header", withClassName(className, applier))
}

@JsName("hgroup")
fun Props.hgroup(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("hgroup", withClassName(className, applier))
}

@JsName("hr")
fun Props.hr(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("hr", withClassName(className, applier))
}

@JsName("html")
fun Props.html(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("html", withClassName(className, applier))
}

@JsName("i")
fun Props.i(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("i", withClassName(className, applier))
}

@JsName("iframe")
fun Props.iframe(className: String? = null, applier: Applier<HtmlIFrameElementProps>) {
  addTag("iframe", withClassName(className, applier))
}

@JsName("img")
fun Props.img(className: String? = null, applier: Applier<HtmlImageElementProps>) {
  addTag("img", withClassName(className, applier))
}

@JsName("input")
fun Props.input(className: String? = null, applier: Applier<HtmlInputElementProps>) {
  addTag("input", withClassName(className, applier))
}

@JsName("ins")
fun Props.ins(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("ins", withClassName(className, applier))
}

@JsName("kbd")
fun Props.kbd(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("kbd", withClassName(className, applier))
}

@JsName("keygen")
fun Props.keygen(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("keygen", withClassName(className, applier))
}

@JsName("label")
fun Props.label(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("label", withClassName(className, applier))
}

@JsName("legend")
fun Props.legend(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("legend", withClassName(className, applier))
}

@JsName("li")
fun Props.li(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("li", withClassName(className, applier))
}

@JsName("link")
fun Props.link(className: String? = null, applier: Applier<HtmlLinkElementProps>) {
  addTag("link", withClassName(className, applier))
}

@JsName("main")
fun Props.main(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("main", withClassName(className, applier))
}

@JsName("map")
fun Props.map(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("map", withClassName(className, applier))
}

@JsName("mark")
fun Props.mark(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("mark", withClassName(className, applier))
}

@JsName("menu")
fun Props.menu(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("menu", withClassName(className, applier))
}

@JsName("menuitem")
fun Props.menuitem(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("menuitem", withClassName(className, applier))
}

@JsName("meta")
fun Props.meta(className: String? = null, applier: Applier<HtmlMetaElementProps>) {
  addTag("meta", withClassName(className, applier))
}

@JsName("meter")
fun Props.meter(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("meter", withClassName(className, applier))
}

@JsName("nav")
fun Props.nav(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("nav", withClassName(className, applier))
}

@JsName("noscript")
fun Props.noscript(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("noscript", withClassName(className, applier))
}

@JsName("objectTag")
fun Props.objectTag(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("objectTag", withClassName(className, applier))
}

@JsName("ol")
fun Props.ol(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("ol", withClassName(className, applier))
}

@JsName("optgroup")
fun Props.optgroup(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("optgroup", withClassName(className, applier))
}

@JsName("option")
fun Props.option(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("option", withClassName(className, applier))
}

@JsName("output")
fun Props.output(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("output", withClassName(className, applier))
}

@JsName("p")
fun Props.p(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("p", withClassName(className, applier))
}

@JsName("param")
fun Props.param(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("param", withClassName(className, applier))
}

@JsName("picture")
fun Props.picture(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("picture", withClassName(className, applier))
}

@JsName("pre")
fun Props.pre(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("pre", withClassName(className, applier))
}

@JsName("progress")
fun Props.progress(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("progress", withClassName(className, applier))
}

@JsName("q")
fun Props.q(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("q", withClassName(className, applier))
}

@JsName("rp")
fun Props.rp(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("rp", withClassName(className, applier))
}

@JsName("rt")
fun Props.rt(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("rt", withClassName(className, applier))
}

@JsName("ruby")
fun Props.ruby(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("ruby", withClassName(className, applier))
}

@JsName("s")
fun Props.s(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("s", withClassName(className, applier))
}

@JsName("samp")
fun Props.samp(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("samp", withClassName(className, applier))
}

@JsName("script")
fun Props.script(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("script", withClassName(className, applier))
}

@JsName("section")
fun Props.section(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("section", withClassName(className, applier))
}

@JsName("select")
fun Props.select(className: String? = null, applier: Applier<HtmlSelectElementProps>) {
  addTag("select", withClassName(className, applier))
}

@JsName("small")
fun Props.small(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("small", withClassName(className, applier))
}

@JsName("source")
fun Props.source(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("source", withClassName(className, applier))
}

@JsName("span")
fun Props.span(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("span", withClassName(className, applier))
}

@JsName("strong")
fun Props.strong(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("strong", withClassName(className, applier))
}

@JsName("style")
fun Props.style(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("style", withClassName(className, applier))
}

@JsName("sub")
fun Props.sub(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("sub", withClassName(className, applier))
}

@JsName("summary")
fun Props.summary(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("summary", withClassName(className, applier))
}

@JsName("sup")
fun Props.sup(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("sup", withClassName(className, applier))
}

@JsName("table")
fun Props.table(className: String? = null, applier: Applier<HtmlTableElementProps>) {
  addTag("table", withClassName(className, applier))
}

@JsName("tbody")
fun Props.tbody(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("tbody", withClassName(className, applier))
}

@JsName("td")
fun Props.td(className: String? = null, applier: Applier<HtmlTableColElementProps>) {
  addTag("td", withClassName(className, applier))
}

@JsName("textarea")
fun Props.textarea(className: String? = null, applier: Applier<HtmlTextAreaElementProps>) {
  addTag("textarea", withClassName(className, applier))
}

@JsName("tfoot")
fun Props.tfoot(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("tfoot", withClassName(className, applier))
}

@JsName("th")
fun Props.th(className: String? = null, applier: Applier<HtmlTableColElementProps>) {
  addTag("th", withClassName(className, applier))
}

@JsName("thead")
fun Props.thead(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("thead", withClassName(className, applier))
}

@JsName("time")
fun Props.time(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("time", withClassName(className, applier))
}

@JsName("title")
fun Props.title(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("title", withClassName(className, applier))
}

@JsName("tr")
fun Props.tr(className: String? = null, applier: Applier<HtmlTableRowElementProps>) {
  addTag("tr", withClassName(className, applier))
}

@JsName("track")
fun Props.track(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("track", withClassName(className, applier))
}

@JsName("u")
fun Props.u(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("u", withClassName(className, applier))
}

@JsName("ul")
fun Props.ul(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("ul", withClassName(className, applier))
}

@JsName("variable")
fun Props.variable(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("variable", withClassName(className, applier))
}

@JsName("video")
fun Props.video(className: String? = null, applier: Applier<HtmlVideoElementProps>) {
  addTag("video", withClassName(className, applier))
}

@JsName("wbr")
fun Props.wbr(className: String? = null, applier: Applier<HtmlElementProps>) {
  addTag("wbr", withClassName(className, applier))
}

// SVG
@JsName("svg")
fun Props.svg(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("svg", withClassName(className, applier))
}

@JsName("circle")
fun Props.circle(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("circle", withClassName(className, applier))
}

@JsName("defs")
fun Props.defs(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("defs", withClassName(className, applier))
}

@JsName("ellipse")
fun Props.ellipse(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("ellipse", withClassName(className, applier))
}

@JsName("g")
fun Props.g(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("g", withClassName(className, applier))
}

@JsName("image")
fun Props.image(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("image", withClassName(className, applier))
}

@JsName("line")
fun Props.line(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("line", withClassName(className, applier))
}

@JsName("linearGradient")
fun Props.linearGradient(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("linearGradient", withClassName(className, applier))
}

@JsName("mask")
fun Props.mask(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("mask", withClassName(className, applier))
}

@JsName("path")
fun Props.path(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("path", withClassName(className, applier))
}

@JsName("pattern")
fun Props.pattern(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("pattern", withClassName(className, applier))
}

@JsName("polygon")
fun Props.polygon(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("polygon", withClassName(className, applier))
}

@JsName("polyline")
fun Props.polyline(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("polyline", withClassName(className, applier))
}

@JsName("radialGradient")
fun Props.radialGradient(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("radialGradient", withClassName(className, applier))
}

@JsName("rect")
fun Props.rect(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("rect", withClassName(className, applier))
}

@JsName("stop")
fun Props.stop(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("stop", withClassName(className, applier))
}

@JsName("symbol")
fun Props.symbol(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("symbol", withClassName(className, applier))
}

@JsName("text")
fun Props.text(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("text", withClassName(className, applier))
}

@JsName("tspan")
fun Props.tspan(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("tspan", withClassName(className, applier))
}

@JsName("use")
fun Props.use(className: String? = null, applier: Applier<SVGElementProps>) {
  addTag("use", withClassName(className, applier))
}