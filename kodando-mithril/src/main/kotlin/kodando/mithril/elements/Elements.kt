package kodando.mithril.elements

import kodando.mithril.*

private fun <T : Props> Props.addTag(name: String, applier: Applier<T>) {
    addChild(
        createElement(name, withProps(applier))
    )
}

fun Props.h1(applier: Applier<HtmlElementProps>) {
    addTag("h1", applier)
}

fun Props.h2(applier: Applier<HtmlElementProps>) {
    addTag("h2", applier)
}

fun Props.h3(applier: Applier<HtmlElementProps>) {
    addTag("h3", applier)
}

fun Props.h4(applier: Applier<HtmlElementProps>) {
    addTag("h4", applier)
}

fun Props.h5(applier: Applier<HtmlElementProps>) {
    addTag("h5", applier)
}

fun Props.h6(applier: Applier<HtmlElementProps>) {
    addTag("h6", applier)
}

fun Props.span(applier: Applier<HtmlElementProps>) {
    addTag("span", applier)
}

fun Props.main(applier: Applier<HtmlElementProps>) {
    addTag("main", applier)
}

fun Props.button(applier: Applier<HtmlButtonProps>) {
    addTag("button", applier)
}
