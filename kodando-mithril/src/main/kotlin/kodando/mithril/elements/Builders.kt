package kodando.mithril.elements

import kodando.mithril.*

private fun <T : Props> Props.addTag(name: String, applier: Applier<T>) {
    addChild(
        createElement(name, createProps(applier))
    )
}

fun <T : HtmlElementProps> withClassName(
    className: String?,
    applier: Applier<T>): Applier<T> = {

    if (className != null) {
        this.className = className
    }

    applier()
}

fun Props.h1(className: String? = null, applier: Applier<HtmlElementProps>) {
    addTag("h1", withClassName(className, applier))
}

fun Props.h2(className: String? = null, applier: Applier<HtmlElementProps>) {
    addTag("h2", withClassName(className, applier))
}

fun Props.h3(className: String? = null, applier: Applier<HtmlElementProps>) {
    addTag("h3", withClassName(className, applier))
}

fun Props.h4(className: String? = null, applier: Applier<HtmlElementProps>) {
    addTag("h4", withClassName(className, applier))
}

fun Props.h5(className: String? = null, applier: Applier<HtmlElementProps>) {
    addTag("h5", withClassName(className, applier))
}

fun Props.h6(className: String? = null, applier: Applier<HtmlElementProps>) {
    addTag("h6", withClassName(className, applier))
}

fun Props.div(className: String? = null, applier: Applier<HtmlElementProps>) {
    addTag("div", withClassName(className, applier))
}

fun Props.span(className: String? = null, applier: Applier<HtmlElementProps>) {
    addTag("span", withClassName(className, applier))
}

fun Props.section(className: String? = null, applier: Applier<HtmlElementProps>) {
    addTag("section", withClassName(className, applier))
}

fun Props.header(className: String? = null, applier: Applier<HtmlElementProps>) {
    addTag("header", withClassName(className, applier))
}

fun Props.main(className: String? = null, applier: Applier<HtmlElementProps>) {
    addTag("main", withClassName(className, applier))
}

fun Props.footer(className: String? = null, applier: Applier<HtmlElementProps>) {
    addTag("footer", withClassName(className, applier))
}

fun Props.button(className: String? = null, applier: Applier<HtmlButtonProps>) {
    addTag("button", withClassName(className, applier))
}

fun Props.img(className: String? = null, applier: Applier<HtmlImageProps>) {
    addTag("img", withClassName(className, applier))
}

fun Props.a(className: String? = null, applier: Applier<HtmlAnchorProps>) {
    addTag("a", withClassName(className, applier))
}

