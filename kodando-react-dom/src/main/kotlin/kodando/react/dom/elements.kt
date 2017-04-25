@file:Suppress("unused", "UNUSED_PARAMETER")

package kodando.react.dom

import kodando.react.*
import kodando.runtime.unsafe.objectWithShapeBy

/**
 * Created by danfma on 19/01/17.
 */

fun ReactProps.a(className: String? = null, setter: PropSetter<HTMLElementAnchorElementProps>) = append(A(className, setter))

fun ReactProps.abbr(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Abbr(className, setter))

fun ReactProps.address(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Address(className, setter))

fun ReactProps.area(className: String? = null, setter: PropSetter<HTMLAreaElementAttributes>) = append(Area(className, setter))

fun ReactProps.article(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Article(className, setter))

fun ReactProps.aside(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Aside(className, setter))

fun ReactProps.audio(className: String? = null, setter: PropSetter<HTMLAudioElementAttributes>) = append(Audio(className, setter))

fun ReactProps.b(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(B(className, setter))

fun ReactProps.base(className: String? = null, setter: PropSetter<HTMLBaseElementAttributes>) = append(Base(className, setter))

fun ReactProps.bdi(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Bdi(className, setter))

fun ReactProps.bdo(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Bdo(className, setter))

fun ReactProps.big(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Big(className, setter))

fun ReactProps.blockquote(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Blockquote(className, setter))

fun ReactProps.body(className: String? = null, setter: PropSetter<HTMLBodyElementAttributes>) = append(Body(className, setter))

fun ReactProps.br(className: String? = null, setter: PropSetter<HTMLBRElementAttributes>) = append(Br(className, setter))

fun ReactProps.br(className: String? = null) = br(className) { }

fun ReactProps.button(className: String? = null, setter: PropSetter<HTMLButtonElementAttributes>) = append(Button(className, setter))

fun ReactProps.canvas(className: String? = null, setter: PropSetter<HTMLCanvasElementAttributes>) = append(Canvas(className, setter))

fun ReactProps.caption(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Caption(className, setter))

fun ReactProps.cite(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Cite(className, setter))

fun ReactProps.code(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Code(className, setter))

fun ReactProps.col(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Col(className, setter))

fun ReactProps.colgroup(className: String? = null, setter: PropSetter<HTMLTableColElementAttributes>) = append(Colgroup(className, setter))

fun ReactProps.data(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Data(className, setter))

fun ReactProps.datalist(className: String? = null, setter: PropSetter<HTMLDataListElementAttributes>) = append(Datalist(className, setter))

fun ReactProps.dd(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Dd(className, setter))

fun ReactProps.del(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Del(className, setter))

fun ReactProps.details(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Details(className, setter))

fun ReactProps.dfn(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Dfn(className, setter))

fun ReactProps.dialog(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Dialog(className, setter))

fun ReactProps.div(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Div(className, setter))

fun ReactProps.dl(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Dl(className, setter))

fun ReactProps.dt(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Dt(className, setter))

fun ReactProps.em(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Em(className, setter))

fun ReactProps.embed(className: String? = null, setter: PropSetter<HTMLEmbedElementAttributes>) = append(Embed(className, setter))

fun ReactProps.fieldset(className: String? = null, setter: PropSetter<HTMLFieldSetElementAttributes>) = append(Fieldset(className, setter))

fun ReactProps.figcaption(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Figcaption(className, setter))

fun ReactProps.figure(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Figure(className, setter))

fun ReactProps.footer(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Footer(className, setter))

fun ReactProps.form(className: String? = null, setter: PropSetter<HTMLFormElementAttributes>) = append(Form(className, setter))

fun ReactProps.h1(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H1(className, setter))

fun ReactProps.h2(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H2(className, setter))

fun ReactProps.h3(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H3(className, setter))

fun ReactProps.h4(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H4(className, setter))

fun ReactProps.h5(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H5(className, setter))

fun ReactProps.h6(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(H6(className, setter))

fun ReactProps.head(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Head(className, setter))

fun ReactProps.header(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Header(className, setter))

fun ReactProps.hgroup(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Hgroup(className, setter))

fun ReactProps.hr(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Hr(className, setter))

fun ReactProps.html(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Html(className, setter))

fun ReactProps.i(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(I(className, setter))

fun ReactProps.i(className: String? = null) = i(className) {}

fun ReactProps.iframe(className: String? = null, setter: PropSetter<HTMLIFrameElementAttributes>) = append(Iframe(className, setter))

fun ReactProps.img(className: String? = null, setter: PropSetter<HTMLImageElementAttributes>) = append(Img(className, setter))

fun ReactProps.input(className: String? = null, setter: PropSetter<HTMLInputElementAttributes>) = append(Input(className, setter))

fun ReactProps.ins(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Ins(className, setter))

fun ReactProps.kbd(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Kbd(className, setter))

fun ReactProps.keygen(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Keygen(className, setter))

fun ReactProps.label(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Label(className, setter))

fun ReactProps.legend(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Legend(className, setter))

fun ReactProps.li(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Li(className, setter))

fun ReactProps.link(className: String? = null, setter: PropSetter<HTMLLinkElementAttributes>) = append(Link(className, setter))

fun ReactProps.main(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Main(className, setter))

fun ReactProps.map(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Map(className, setter))

fun ReactProps.mark(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Mark(className, setter))

fun ReactProps.menu(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Menu(className, setter))

fun ReactProps.menuitem(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Menuitem(className, setter))

fun ReactProps.meta(className: String? = null, setter: PropSetter<HTMLMetaElementAttributes>) = append(Meta(className, setter))

fun ReactProps.meter(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Meter(className, setter))

fun ReactProps.nav(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Nav(className, setter))

fun ReactProps.noscript(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Noscript(className, setter))

fun ReactProps.objectTag(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(ObjectTag(className, setter))

fun ReactProps.ol(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Ol(className, setter))

fun ReactProps.optgroup(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Optgroup(className, setter))

fun ReactProps.option(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Option(className, setter))

fun ReactProps.output(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Output(className, setter))

fun ReactProps.p(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(P(className, setter))

fun ReactProps.param(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Param(className, setter))

fun ReactProps.picture(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Picture(className, setter))

fun ReactProps.pre(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Pre(className, setter))

fun ReactProps.progress(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Progress(className, setter))

fun ReactProps.q(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Q(className, setter))

fun ReactProps.rp(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Rp(className, setter))

fun ReactProps.rt(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Rt(className, setter))

fun ReactProps.ruby(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Ruby(className, setter))

fun ReactProps.s(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(S(className, setter))

fun ReactProps.samp(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Samp(className, setter))

fun ReactProps.script(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Script(className, setter))

fun ReactProps.section(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Section(className, setter))

fun ReactProps.select(className: String? = null, setter: PropSetter<HTMLSelectElementAttributes>) = append(Select(className, setter))

fun ReactProps.small(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Small(className, setter))

fun ReactProps.source(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Source(className, setter))

fun ReactProps.span(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Span(className, setter))

fun ReactProps.strong(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Strong(className, setter))

fun ReactProps.style(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Style(className, setter))

fun ReactProps.sub(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Sub(className, setter))

fun ReactProps.summary(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Summary(className, setter))

fun ReactProps.sup(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Sup(className, setter))

fun ReactProps.table(className: String? = null, setter: PropSetter<HTMLTableElementAttributes>) = append(Table(className, setter))

fun ReactProps.tbody(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Tbody(className, setter))

fun ReactProps.td(className: String? = null, setter: PropSetter<HTMLTableColElementAttributes>) = append(Td(className, setter))

fun ReactProps.textarea(className: String? = null, setter: PropSetter<HTMLInputElementAttributes>) = append(Textarea(className, setter))

fun ReactProps.tfoot(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Tfoot(className, setter))

fun ReactProps.th(className: String? = null, setter: PropSetter<HTMLTableColElementAttributes>) = append(Th(className, setter))

fun ReactProps.thead(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Thead(className, setter))

fun ReactProps.time(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Time(className, setter))

fun ReactProps.title(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Title(className, setter))

fun ReactProps.tr(className: String? = null, setter: PropSetter<HTMLTableRowElementAttributes>) = append(Tr(className, setter))

fun ReactProps.track(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Track(className, setter))

fun ReactProps.u(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(U(className, setter))

fun ReactProps.ul(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Ul(className, setter))

fun ReactProps.variable(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Variable(className, setter))

fun ReactProps.video(className: String? = null, setter: PropSetter<HTMLVideoElementAttributes>) = append(Video(className, setter))

fun ReactProps.wbr(className: String? = null, setter: PropSetter<HTMLElementAttributes>) = append(Wbr(className, setter))

// SVG
fun ReactProps.svg(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Svg(className, setter))

fun ReactProps.circle(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Circle(className, setter))

fun ReactProps.defs(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Defs(className, setter))

fun ReactProps.ellipse(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Ellipse(className, setter))

fun ReactProps.g(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(G(className, setter))

fun ReactProps.image(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Image(className, setter))

fun ReactProps.line(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Line(className, setter))

fun ReactProps.linearGradient(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(LinearGradient(className, setter))

fun ReactProps.mask(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Mask(className, setter))

fun ReactProps.path(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Path(className, setter))

fun ReactProps.pattern(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Pattern(className, setter))

fun ReactProps.polygon(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Polygon(className, setter))

fun ReactProps.polyline(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Polyline(className, setter))

fun ReactProps.radialGradient(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(RadialGradient(className, setter))

fun ReactProps.rect(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Rect(className, setter))

fun ReactProps.stop(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Stop(className, setter))

fun ReactProps.symbol(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Symbol(className, setter))

fun ReactProps.text(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Text(className, setter))

fun ReactProps.tspan(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Tspan(className, setter))

fun ReactProps.use(className: String? = null, setter: PropSetter<SVGElementAttributes>) = append(Use(className, setter))


fun styleOf(setter: CSSProperties.() -> Unit): CSSProperties {
    return objectWithShapeBy(setter)
}
