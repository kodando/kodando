@file:Suppress("unused", "UNUSED_PARAMETER")

package kodando.react.dom

import kodando.react.*
import kodando.runtime.unsafe.objectWithShapeBy

/**
 * Created by danfma on 19/01/17.
 */

fun ReactProps.a(className: String? = null, setter: PropSetter<HTMLElementAnchorElementProps>) = append(A(setter))

fun ReactProps.abbr(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Abbr(setter))

fun ReactProps.address(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Address(setter))

fun ReactProps.area(className: String? = null, setter: PropSetter<HTMLAreaElementAttributes>) = append(Area(setter))

fun ReactProps.article(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Article(setter))

fun ReactProps.aside(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Aside(setter))

fun ReactProps.audio(className: String? = null, setter: PropSetter<HTMLAudioElementAttributes>) = append(Audio(setter))

fun ReactProps.b(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(B(setter))

fun ReactProps.base(className: String? = null, setter: PropSetter<HTMLBaseElementAttributes>) = append(Base(setter))

fun ReactProps.bdi(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Bdi(setter))

fun ReactProps.bdo(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Bdo(setter))

fun ReactProps.big(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Big(setter))

fun ReactProps.blockquote(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Blockquote(setter))

fun ReactProps.body(className: String? = null, setter: PropSetter<HTMLBodyElementAttributes>) = append(Body(setter))

fun ReactProps.br(className: String? = null, setter: PropSetter<HTMLBRElementAttributes>) = append(Br(setter))

fun ReactProps.br(className: String? = null) = br { }

fun ReactProps.button(className: String? = null, setter: PropSetter<HTMLButtonElementAttributes>) = append(Button(setter))

fun ReactProps.canvas(className: String? = null, setter: PropSetter<HTMLCanvasElementAttributes>) = append(Canvas(setter))

fun ReactProps.caption(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Caption(setter))

fun ReactProps.cite(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Cite(setter))

fun ReactProps.code(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Code(setter))

fun ReactProps.col(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Col(setter))

fun ReactProps.colgroup(className: String? = null, setter: PropSetter<HTMLTableColElementAttributes>) = append(Colgroup(setter))

fun ReactProps.data(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Data(setter))

fun ReactProps.datalist(className: String? = null, setter: PropSetter<HTMLDataListElementAttributes>) = append(Datalist(setter))

fun ReactProps.dd(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Dd(setter))

fun ReactProps.del(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Del(setter))

fun ReactProps.details(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Details(setter))

fun ReactProps.dfn(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Dfn(setter))

fun ReactProps.dialog(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Dialog(setter))

fun ReactProps.div(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Div(setter))

fun ReactProps.dl(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Dl(setter))

fun ReactProps.dt(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Dt(setter))

fun ReactProps.em(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Em(setter))

fun ReactProps.embed(className: String? = null, setter: PropSetter<HTMLEmbedElementAttributes>) = append(Embed(setter))

fun ReactProps.fieldset(className: String? = null, setter: PropSetter<HTMLFieldSetElementAttributes>) = append(Fieldset(setter))

fun ReactProps.figcaption(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Figcaption(setter))

fun ReactProps.figure(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Figure(setter))

fun ReactProps.footer(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Footer(setter))

fun ReactProps.form(className: String? = null, setter: PropSetter<HTMLFormElementAttributes>) = append(Form(setter))

fun ReactProps.h1(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H1(setter))

fun ReactProps.h2(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H2(setter))

fun ReactProps.h3(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H3(setter))

fun ReactProps.h4(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H4(setter))

fun ReactProps.h5(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H5(setter))

fun ReactProps.h6(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H6(setter))

fun ReactProps.head(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Head(setter))

fun ReactProps.header(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Header(setter))

fun ReactProps.hgroup(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Hgroup(setter))

fun ReactProps.hr(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Hr(setter))

fun ReactProps.html(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Html(setter))

fun ReactProps.i(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(I(setter))

fun ReactProps.i(className: String? = null) = i(className) {}

fun ReactProps.iframe(className: String? = null, setter: PropSetter<HTMLIFrameElementAttributes>) = append(Iframe(setter))

fun ReactProps.img(className: String? = null, setter: PropSetter<HTMLImageElementAttributes>) = append(Img(setter))

fun ReactProps.input(className: String? = null, setter: PropSetter<HTMLInputElementAttributes>) = append(Input(setter))

fun ReactProps.ins(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Ins(setter))

fun ReactProps.kbd(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Kbd(setter))

fun ReactProps.keygen(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Keygen(setter))

fun ReactProps.label(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Label(setter))

fun ReactProps.legend(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Legend(setter))

fun ReactProps.li(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Li(setter))

fun ReactProps.link(className: String? = null, setter: PropSetter<HTMLLinkElementAttributes>) = append(Link(setter))

fun ReactProps.main(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Main(setter))

fun ReactProps.map(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Map(setter))

fun ReactProps.mark(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Mark(setter))

fun ReactProps.menu(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Menu(setter))

fun ReactProps.menuitem(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Menuitem(setter))

fun ReactProps.meta(className: String? = null, setter: PropSetter<HTMLMetaElementAttributes>) = append(Meta(setter))

fun ReactProps.meter(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Meter(setter))

fun ReactProps.nav(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Nav(setter))

fun ReactProps.noscript(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Noscript(setter))

fun ReactProps.objectTag(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(ObjectTag(setter))

fun ReactProps.ol(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Ol(setter))

fun ReactProps.optgroup(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Optgroup(setter))

fun ReactProps.option(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Option(setter))

fun ReactProps.output(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Output(setter))

fun ReactProps.p(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(P(setter))

fun ReactProps.param(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Param(setter))

fun ReactProps.picture(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Picture(setter))

fun ReactProps.pre(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Pre(setter))

fun ReactProps.progress(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Progress(setter))

fun ReactProps.q(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Q(setter))

fun ReactProps.rp(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Rp(setter))

fun ReactProps.rt(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Rt(setter))

fun ReactProps.ruby(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Ruby(setter))

fun ReactProps.s(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(S(setter))

fun ReactProps.samp(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Samp(setter))

fun ReactProps.script(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Script(setter))

fun ReactProps.section(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Section(setter))

fun ReactProps.select(className: String? = null, setter: PropSetter<HTMLSelectElementAttributes>) = append(Select(setter))

fun ReactProps.small(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Small(setter))

fun ReactProps.source(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Source(setter))

fun ReactProps.span(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Span(setter))

fun ReactProps.strong(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Strong(setter))

fun ReactProps.style(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Style(setter))

fun ReactProps.sub(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Sub(setter))

fun ReactProps.summary(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Summary(setter))

fun ReactProps.sup(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Sup(setter))

fun ReactProps.table(className: String? = null, setter: PropSetter<HTMLTableElementAttributes>) = append(Table(setter))

fun ReactProps.tbody(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Tbody(setter))

fun ReactProps.td(className: String? = null, setter: PropSetter<HTMLTableColElementAttributes>) = append(Td(setter))

fun ReactProps.textarea(className: String? = null, setter: PropSetter<HTMLInputElementAttributes>) = append(Textarea(setter))

fun ReactProps.tfoot(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Tfoot(setter))

fun ReactProps.th(className: String? = null, setter: PropSetter<HTMLTableColElementAttributes>) = append(Th(setter))

fun ReactProps.thead(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Thead(setter))

fun ReactProps.time(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Time(setter))

fun ReactProps.title(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Title(setter))

fun ReactProps.tr(className: String? = null, setter: PropSetter<HTMLTableRowElementAttributes>) = append(Tr(setter))

fun ReactProps.track(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Track(setter))

fun ReactProps.u(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(U(setter))

fun ReactProps.ul(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Ul(setter))

fun ReactProps.variable(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Variable(setter))

fun ReactProps.video(className: String? = null, setter: PropSetter<HTMLVideoElementAttributes>) = append(Video(setter))

fun ReactProps.wbr(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Wbr(setter))

// SVG
fun ReactProps.svg(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Svg(setter))

fun ReactProps.circle(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Circle(setter))

fun ReactProps.defs(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Defs(setter))

fun ReactProps.ellipse(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Ellipse(setter))

fun ReactProps.g(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(G(setter))

fun ReactProps.image(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Image(setter))

fun ReactProps.line(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Line(setter))

fun ReactProps.linearGradient(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(LinearGradient(setter))

fun ReactProps.mask(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Mask(setter))

fun ReactProps.path(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Path(setter))

fun ReactProps.pattern(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Pattern(setter))

fun ReactProps.polygon(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Polygon(setter))

fun ReactProps.polyline(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Polyline(setter))

fun ReactProps.radialGradient(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(RadialGradient(setter))

fun ReactProps.rect(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Rect(setter))

fun ReactProps.stop(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Stop(setter))

fun ReactProps.symbol(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Symbol(setter))

fun ReactProps.text(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Text(setter))

fun ReactProps.tspan(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Tspan(setter))

fun ReactProps.use(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Use(setter))


fun styleOf(setter: CSSProperties.() -> Unit): CSSProperties {
    return objectWithShapeBy(setter)
}
