@file:Suppress("unused", "UNUSED_PARAMETER")

package kodando.react.dom

import kodando.react.*
import kodando.runtime.unsafe.objectWithShapeBy

/**
 * Created by danfma on 19/01/17.
 */

fun ReactProps.a(className: String? = null, setter: PropSetter<HTMLElementAnchorElementProps>) = append(A.build(setter))

fun ReactProps.abbr(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Abbr.build(setter))

fun ReactProps.address(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Address.build(setter))

fun ReactProps.area(className: String? = null, setter: PropSetter<HTMLAreaElementAttributes>) = append(Area.build(setter))

fun ReactProps.article(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Article.build(setter))

fun ReactProps.aside(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Aside.build(setter))

fun ReactProps.audio(className: String? = null, setter: PropSetter<HTMLAudioElementAttributes>) = append(Audio.build(setter))

fun ReactProps.b(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(B.build(setter))

fun ReactProps.base(className: String? = null, setter: PropSetter<HTMLBaseElementAttributes>) = append(Base.build(setter))

fun ReactProps.bdi(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Bdi.build(setter))

fun ReactProps.bdo(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Bdo.build(setter))

fun ReactProps.big(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Big.build(setter))

fun ReactProps.blockquote(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Blockquote.build(setter))

fun ReactProps.body(className: String? = null, setter: PropSetter<HTMLBodyElementAttributes>) = append(Body.build(setter))

fun ReactProps.br(className: String? = null, setter: PropSetter<HTMLBRElementAttributes>) = append(Br.build(setter))

fun ReactProps.br(className: String? = null) = br { }

fun ReactProps.button(className: String? = null, setter: PropSetter<HTMLButtonElementAttributes>) = append(Button.build(setter))

fun ReactProps.canvas(className: String? = null, setter: PropSetter<HTMLCanvasElementAttributes>) = append(Canvas.build(setter))

fun ReactProps.caption(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Caption.build(setter))

fun ReactProps.cite(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Cite.build(setter))

fun ReactProps.code(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Code.build(setter))

fun ReactProps.col(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Col.build(setter))

fun ReactProps.colgroup(className: String? = null, setter: PropSetter<HTMLTableColElementAttributes>) = append(Colgroup.build(setter))

fun ReactProps.data(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Data.build(setter))

fun ReactProps.datalist(className: String? = null, setter: PropSetter<HTMLDataListElementAttributes>) = append(Datalist.build(setter))

fun ReactProps.dd(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Dd.build(setter))

fun ReactProps.del(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Del.build(setter))

fun ReactProps.details(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Details.build(setter))

fun ReactProps.dfn(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Dfn.build(setter))

fun ReactProps.dialog(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Dialog.build(setter))

fun ReactProps.div(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Div.build(setter))

fun ReactProps.dl(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Dl.build(setter))

fun ReactProps.dt(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Dt.build(setter))

fun ReactProps.em(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Em.build(setter))

fun ReactProps.embed(className: String? = null, setter: PropSetter<HTMLEmbedElementAttributes>) = append(Embed.build(setter))

fun ReactProps.fieldset(className: String? = null, setter: PropSetter<HTMLFieldSetElementAttributes>) = append(Fieldset.build(setter))

fun ReactProps.figcaption(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Figcaption.build(setter))

fun ReactProps.figure(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Figure.build(setter))

fun ReactProps.footer(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Footer.build(setter))

fun ReactProps.form(className: String? = null, setter: PropSetter<HTMLFormElementAttributes>) = append(Form.build(setter))

fun ReactProps.h1(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H1.build(setter))

fun ReactProps.h2(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H2.build(setter))

fun ReactProps.h3(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H3.build(setter))

fun ReactProps.h4(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H4.build(setter))

fun ReactProps.h5(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H5.build(setter))

fun ReactProps.h6(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H6.build(setter))

fun ReactProps.head(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Head.build(setter))

fun ReactProps.header(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Header.build(setter))

fun ReactProps.hgroup(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Hgroup.build(setter))

fun ReactProps.hr(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Hr.build(setter))

fun ReactProps.html(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Html.build(setter))

fun ReactProps.i(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(I.build(setter))

fun ReactProps.i(className: String? = null) = i(className) {}

fun ReactProps.iframe(className: String? = null, setter: PropSetter<HTMLIFrameElementAttributes>) = append(Iframe.build(setter))

fun ReactProps.img(className: String? = null, setter: PropSetter<HTMLImageElementAttributes>) = append(Img.build(setter))

fun ReactProps.input(className: String? = null, setter: PropSetter<HTMLInputElementAttributes>) = append(Input.build(setter))

fun ReactProps.ins(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Ins.build(setter))

fun ReactProps.kbd(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Kbd.build(setter))

fun ReactProps.keygen(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Keygen.build(setter))

fun ReactProps.label(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Label.build(setter))

fun ReactProps.legend(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Legend.build(setter))

fun ReactProps.li(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Li.build(setter))

fun ReactProps.link(className: String? = null, setter: PropSetter<HTMLLinkElementAttributes>) = append(Link.build(setter))

fun ReactProps.main(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Main.build(setter))

fun ReactProps.map(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Map.build(setter))

fun ReactProps.mark(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Mark.build(setter))

fun ReactProps.menu(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Menu.build(setter))

fun ReactProps.menuitem(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Menuitem.build(setter))

fun ReactProps.meta(className: String? = null, setter: PropSetter<HTMLMetaElementAttributes>) = append(Meta.build(setter))

fun ReactProps.meter(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Meter.build(setter))

fun ReactProps.nav(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Nav.build(setter))

fun ReactProps.noscript(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Noscript.build(setter))

fun ReactProps.objectTag(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(ObjectTag.build(setter))

fun ReactProps.ol(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Ol.build(setter))

fun ReactProps.optgroup(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Optgroup.build(setter))

fun ReactProps.option(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Option.build(setter))

fun ReactProps.output(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Output.build(setter))

fun ReactProps.p(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(P.build(setter))

fun ReactProps.param(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Param.build(setter))

fun ReactProps.picture(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Picture.build(setter))

fun ReactProps.pre(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Pre.build(setter))

fun ReactProps.progress(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Progress.build(setter))

fun ReactProps.q(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Q.build(setter))

fun ReactProps.rp(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Rp.build(setter))

fun ReactProps.rt(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Rt.build(setter))

fun ReactProps.ruby(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Ruby.build(setter))

fun ReactProps.s(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(S.build(setter))

fun ReactProps.samp(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Samp.build(setter))

fun ReactProps.script(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Script.build(setter))

fun ReactProps.section(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Section.build(setter))

fun ReactProps.select(className: String? = null, setter: PropSetter<HTMLSelectElementAttributes>) = append(Select.build(setter))

fun ReactProps.small(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Small.build(setter))

fun ReactProps.source(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Source.build(setter))

fun ReactProps.span(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Span.build(setter))

fun ReactProps.strong(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Strong.build(setter))

fun ReactProps.style(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Style.build(setter))

fun ReactProps.sub(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Sub.build(setter))

fun ReactProps.summary(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Summary.build(setter))

fun ReactProps.sup(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Sup.build(setter))

fun ReactProps.table(className: String? = null, setter: PropSetter<HTMLTableElementAttributes>) = append(Table.build(setter))

fun ReactProps.tbody(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Tbody.build(setter))

fun ReactProps.td(className: String? = null, setter: PropSetter<HTMLTableColElementAttributes>) = append(Td.build(setter))

fun ReactProps.textarea(className: String? = null, setter: PropSetter<HTMLInputElementAttributes>) = append(Textarea.build(setter))

fun ReactProps.tfoot(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Tfoot.build(setter))

fun ReactProps.th(className: String? = null, setter: PropSetter<HTMLTableColElementAttributes>) = append(Th.build(setter))

fun ReactProps.thead(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Thead.build(setter))

fun ReactProps.time(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Time.build(setter))

fun ReactProps.title(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Title.build(setter))

fun ReactProps.tr(className: String? = null, setter: PropSetter<HTMLTableRowElementAttributes>) = append(Tr.build(setter))

fun ReactProps.track(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Track.build(setter))

fun ReactProps.u(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(U.build(setter))

fun ReactProps.ul(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Ul.build(setter))

fun ReactProps.variable(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Variable.build(setter))

fun ReactProps.video(className: String? = null, setter: PropSetter<HTMLVideoElementAttributes>) = append(Video.build(setter))

fun ReactProps.wbr(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Wbr.build(setter))

// SVG
fun ReactProps.svg(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Svg.build(setter))

fun ReactProps.circle(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Circle.build(setter))

fun ReactProps.defs(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Defs.build(setter))

fun ReactProps.ellipse(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Ellipse.build(setter))

fun ReactProps.g(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(G.build(setter))

fun ReactProps.image(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Image.build(setter))

fun ReactProps.line(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Line.build(setter))

fun ReactProps.linearGradient(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(LinearGradient.build(setter))

fun ReactProps.mask(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Mask.build(setter))

fun ReactProps.path(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Path.build(setter))

fun ReactProps.pattern(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Pattern.build(setter))

fun ReactProps.polygon(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Polygon.build(setter))

fun ReactProps.polyline(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Polyline.build(setter))

fun ReactProps.radialGradient(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(RadialGradient.build(setter))

fun ReactProps.rect(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Rect.build(setter))

fun ReactProps.stop(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Stop.build(setter))

fun ReactProps.symbol(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Symbol.build(setter))

fun ReactProps.text(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Text.build(setter))

fun ReactProps.tspan(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Tspan.build(setter))

fun ReactProps.use(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Use.build(setter))


fun styleOf(setter: CSSProperties.() -> Unit): CSSProperties {
    return objectWithShapeBy(setter)
}
