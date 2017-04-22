@file:Suppress("unused")

package kodando.react.dom

/**
 * Created by danfma on 03/06/2016.
 */


object a : HTMLElementBuilder<HTMLElementAnchorElementProps>("a", ::HTMLElementAnchorElementProps)


object abbr : HTMLElementBuilder<HTMLElementAttributes>("abbr", ::HTMLElementAttributes)


object address : HTMLElementBuilder<HTMLElementAttributes>("address", ::HTMLElementAttributes)


object area : HTMLElementBuilder<HTMLAreaElementAttributes>("area", ::HTMLAreaElementAttributes)


object article : HTMLElementBuilder<HTMLElementAttributes>("article", ::HTMLElementAttributes)


object aside : HTMLElementBuilder<HTMLElementAttributes>("aside", ::HTMLElementAttributes)


object audio : HTMLElementBuilder<HTMLAudioElementAttributes>("audio", ::HTMLAudioElementAttributes)


object b : HTMLElementBuilder<HTMLElementAttributes>("b", ::HTMLElementAttributes)


object base : HTMLElementBuilder<HTMLBaseElementAttributes>("base", ::HTMLBaseElementAttributes)


object bdi : HTMLElementBuilder<HTMLElementAttributes>("bdi", ::HTMLElementAttributes)


object bdo : HTMLElementBuilder<HTMLElementAttributes>("bdo", ::HTMLElementAttributes)


object big : HTMLElementBuilder<HTMLElementAttributes>("big", ::HTMLElementAttributes)


object blockquote : HTMLElementBuilder<HTMLElementAttributes>("blockquote", ::HTMLElementAttributes)


object body : HTMLElementBuilder<HTMLBodyElementAttributes>("body", ::HTMLBodyElementAttributes)


object br : HTMLElementBuilder<HTMLBRElementAttributes>("br", ::HTMLBRElementAttributes) {
    operator fun invoke() = this.invoke { }
}


object button : HTMLElementBuilder<HTMLButtonElementAttributes>("button", ::HTMLButtonElementAttributes)


object canvas : HTMLElementBuilder<HTMLCanvasElementAttributes>("canvas", ::HTMLCanvasElementAttributes)


object caption : HTMLElementBuilder<HTMLElementAttributes>("caption", ::HTMLElementAttributes)


object cite : HTMLElementBuilder<HTMLElementAttributes>("cite", ::HTMLElementAttributes)


object code : HTMLElementBuilder<HTMLElementAttributes>("code", ::HTMLElementAttributes)


object col : HTMLElementBuilder<HTMLElementAttributes>("col", ::HTMLElementAttributes)


object colgroup : HTMLElementBuilder<HTMLTableColElementAttributes>("colgroup", ::HTMLTableColElementAttributes)


object data : HTMLElementBuilder<HTMLElementAttributes>("data", ::HTMLElementAttributes)


object datalist : HTMLElementBuilder<HTMLDataListElementAttributes>("datalist", ::HTMLDataListElementAttributes)


object dd : HTMLElementBuilder<HTMLElementAttributes>("dd", ::HTMLElementAttributes)


object del : HTMLElementBuilder<HTMLElementAttributes>("del", ::HTMLElementAttributes)


object details : HTMLElementBuilder<HTMLElementAttributes>("details", ::HTMLElementAttributes)


object dfn : HTMLElementBuilder<HTMLElementAttributes>("dfn", ::HTMLElementAttributes)


object dialog : HTMLElementBuilder<HTMLElementAttributes>("dialog", ::HTMLElementAttributes)


object div : HTMLElementBuilder<HTMLElementAttributes>("div", ::HTMLElementAttributes)


object dl : HTMLElementBuilder<HTMLElementAttributes>("dl", ::HTMLElementAttributes)


object dt : HTMLElementBuilder<HTMLElementAttributes>("dt", ::HTMLElementAttributes)


object em : HTMLElementBuilder<HTMLElementAttributes>("em", ::HTMLElementAttributes)


object embed : HTMLElementBuilder<HTMLEmbedElementAttributes>("embed", ::HTMLEmbedElementAttributes)


object fieldset : HTMLElementBuilder<HTMLFieldSetElementAttributes>("fieldset", ::HTMLFieldSetElementAttributes)


object figcaption : HTMLElementBuilder<HTMLElementAttributes>("figcaption", ::HTMLElementAttributes)


object figure : HTMLElementBuilder<HTMLElementAttributes>("figure", ::HTMLElementAttributes)


object footer : HTMLElementBuilder<HTMLElementAttributes>("footer", ::HTMLElementAttributes)


object form : HTMLElementBuilder<HTMLFormElementAttributes>("form", ::HTMLFormElementAttributes)


object h1 : HTMLElementBuilder<HTMLElementAttributes>("h1", ::HTMLElementAttributes)


object h2 : HTMLElementBuilder<HTMLElementAttributes>("h2", ::HTMLElementAttributes)


object h3 : HTMLElementBuilder<HTMLElementAttributes>("h3", ::HTMLElementAttributes)


object h4 : HTMLElementBuilder<HTMLElementAttributes>("h4", ::HTMLElementAttributes)


object h5 : HTMLElementBuilder<HTMLElementAttributes>("h5", ::HTMLElementAttributes)


object h6 : HTMLElementBuilder<HTMLElementAttributes>("h6", ::HTMLElementAttributes)


object head : HTMLElementBuilder<HTMLElementAttributes>("head", ::HTMLElementAttributes)


object header : HTMLElementBuilder<HTMLElementAttributes>("header", ::HTMLElementAttributes)


object hgroup : HTMLElementBuilder<HTMLElementAttributes>("hgroup", ::HTMLElementAttributes)


object hr : HTMLElementBuilder<HTMLElementAttributes>("hr", ::HTMLElementAttributes)


object html : HTMLElementBuilder<HTMLElementAttributes>("html", ::HTMLElementAttributes)


object i : HTMLElementBuilder<HTMLElementAttributes>("i", ::HTMLElementAttributes)


object iframe : HTMLElementBuilder<HTMLIFrameElementAttributes>("iframe", ::HTMLIFrameElementAttributes)


object img : HTMLElementBuilder<HTMLImageElementAttributes>("img", ::HTMLImageElementAttributes)


object input : HTMLElementBuilder<HTMLInputElementAttributes>("input", ::HTMLInputElementAttributes)


object ins : HTMLElementBuilder<HTMLElementAttributes>("ins", ::HTMLElementAttributes)


object kbd : HTMLElementBuilder<HTMLElementAttributes>("kbd", ::HTMLElementAttributes)


object keygen : HTMLElementBuilder<HTMLElementAttributes>("keygen", ::HTMLElementAttributes)


object label : HTMLElementBuilder<HTMLElementAttributes>("label", ::HTMLElementAttributes)


object legend : HTMLElementBuilder<HTMLElementAttributes>("legend", ::HTMLElementAttributes)


object li : HTMLElementBuilder<HTMLElementAttributes>("li", ::HTMLElementAttributes)


object link : HTMLElementBuilder<HTMLLinkElementAttributes>("link", ::HTMLLinkElementAttributes)


object main : HTMLElementBuilder<HTMLElementAttributes>("main", ::HTMLElementAttributes)


object map : HTMLElementBuilder<HTMLElementAttributes>("map", ::HTMLElementAttributes)


object mark : HTMLElementBuilder<HTMLElementAttributes>("mark", ::HTMLElementAttributes)


object menu : HTMLElementBuilder<HTMLElementAttributes>("menu", ::HTMLElementAttributes)


object menuitem : HTMLElementBuilder<HTMLElementAttributes>("menuitem", ::HTMLElementAttributes)


object meta : HTMLElementBuilder<HTMLMetaElementAttributes>("meta", ::HTMLMetaElementAttributes)


object meter : HTMLElementBuilder<HTMLElementAttributes>("meter", ::HTMLElementAttributes)


object nav : HTMLElementBuilder<HTMLElementAttributes>("nav", ::HTMLElementAttributes)


object noscript : HTMLElementBuilder<HTMLElementAttributes>("noscript", ::HTMLElementAttributes)


object objectTag : HTMLElementBuilder<HTMLElementAttributes>("object", ::HTMLElementAttributes)


object ol : HTMLElementBuilder<HTMLElementAttributes>("ol", ::HTMLElementAttributes)


object optgroup : HTMLElementBuilder<HTMLElementAttributes>("optgroup", ::HTMLElementAttributes)


object option : HTMLElementBuilder<HTMLElementAttributes>("option", ::HTMLElementAttributes)


object output : HTMLElementBuilder<HTMLElementAttributes>("output", ::HTMLElementAttributes)


object p : HTMLElementBuilder<HTMLElementAttributes>("p", ::HTMLElementAttributes)


object param : HTMLElementBuilder<HTMLElementAttributes>("param", ::HTMLElementAttributes)


object picture : HTMLElementBuilder<HTMLElementAttributes>("picture", ::HTMLElementAttributes)


object pre : HTMLElementBuilder<HTMLElementAttributes>("pre", ::HTMLElementAttributes)


object progress : HTMLElementBuilder<HTMLElementAttributes>("progress", ::HTMLElementAttributes)


object q : HTMLElementBuilder<HTMLElementAttributes>("q", ::HTMLElementAttributes)


object rp : HTMLElementBuilder<HTMLElementAttributes>("rp", ::HTMLElementAttributes)


object rt : HTMLElementBuilder<HTMLElementAttributes>("rt", ::HTMLElementAttributes)


object ruby : HTMLElementBuilder<HTMLElementAttributes>("ruby", ::HTMLElementAttributes)


object s : HTMLElementBuilder<HTMLElementAttributes>("s", ::HTMLElementAttributes)


object samp : HTMLElementBuilder<HTMLElementAttributes>("samp", ::HTMLElementAttributes)


object script : HTMLElementBuilder<HTMLElementAttributes>("script", ::HTMLElementAttributes)


object section : HTMLElementBuilder<HTMLElementAttributes>("section", ::HTMLElementAttributes)


object select : HTMLElementBuilder<HTMLSelectElementAttributes>("select", ::HTMLSelectElementAttributes)


object small : HTMLElementBuilder<HTMLElementAttributes>("small", ::HTMLElementAttributes)


object source : HTMLElementBuilder<HTMLElementAttributes>("source", ::HTMLElementAttributes)


object span : HTMLElementBuilder<HTMLElementAttributes>("span", ::HTMLElementAttributes)


object strong : HTMLElementBuilder<HTMLElementAttributes>("strong", ::HTMLElementAttributes)


object style : HTMLElementBuilder<HTMLElementAttributes>("style", ::HTMLElementAttributes)


object sub : HTMLElementBuilder<HTMLElementAttributes>("sub", ::HTMLElementAttributes)


object summary : HTMLElementBuilder<HTMLElementAttributes>("summary", ::HTMLElementAttributes)


object sup : HTMLElementBuilder<HTMLElementAttributes>("sup", ::HTMLElementAttributes)


object table : HTMLElementBuilder<HTMLTableElementAttributes>("table", ::HTMLTableElementAttributes)


object tbody : HTMLElementBuilder<HTMLElementAttributes>("tbody", ::HTMLElementAttributes)


object td : HTMLElementBuilder<HTMLTableColElementAttributes>("td", ::HTMLTableColElementAttributes)


object textarea : HTMLElementBuilder<HTMLInputElementAttributes>("textarea", ::HTMLInputElementAttributes)


object tfoot : HTMLElementBuilder<HTMLElementAttributes>("tfoot", ::HTMLElementAttributes)


object th : HTMLElementBuilder<HTMLTableColElementAttributes>("th", ::HTMLTableColElementAttributes)


object thead : HTMLElementBuilder<HTMLElementAttributes>("thead", ::HTMLElementAttributes)


object time : HTMLElementBuilder<HTMLElementAttributes>("time", ::HTMLElementAttributes)


object title : HTMLElementBuilder<HTMLElementAttributes>("title", ::HTMLElementAttributes)


object tr : HTMLElementBuilder<HTMLTableRowElementAttributes>("tr", ::HTMLTableRowElementAttributes)


object track : HTMLElementBuilder<HTMLElementAttributes>("track", ::HTMLElementAttributes)


object u : HTMLElementBuilder<HTMLElementAttributes>("u", ::HTMLElementAttributes)


object ul : HTMLElementBuilder<HTMLElementAttributes>("ul", ::HTMLElementAttributes)


object variable : HTMLElementBuilder<HTMLElementAttributes>("var", ::HTMLElementAttributes)


object video : HTMLElementBuilder<HTMLVideoElementAttributes>("video", ::HTMLVideoElementAttributes)


object wbr : HTMLElementBuilder<HTMLElementAttributes>("wbr", ::HTMLElementAttributes)


// SVG
object svg : HTMLElementBuilder<SVGElementAttributes>("svg", ::SVGElementAttributes)


object circle : HTMLElementBuilder<SVGElementAttributes>("circle", ::SVGElementAttributes)


object defs : HTMLElementBuilder<SVGElementAttributes>("defs", ::SVGElementAttributes)


object ellipse : HTMLElementBuilder<SVGElementAttributes>("ellipse", ::SVGElementAttributes)


object g : HTMLElementBuilder<SVGElementAttributes>("g", ::SVGElementAttributes)


object image : HTMLElementBuilder<SVGElementAttributes>("image", ::SVGElementAttributes)


object line : HTMLElementBuilder<SVGElementAttributes>("line", ::SVGElementAttributes)


object linearGradient : HTMLElementBuilder<SVGElementAttributes>("linearGradient", ::SVGElementAttributes)


object mask : HTMLElementBuilder<SVGElementAttributes>("mask", ::SVGElementAttributes)


object path : HTMLElementBuilder<SVGElementAttributes>("path", ::SVGElementAttributes)


object pattern : HTMLElementBuilder<SVGElementAttributes>("pattern", ::SVGElementAttributes)


object polygon : HTMLElementBuilder<SVGElementAttributes>("polygon", ::SVGElementAttributes)


object polyline : HTMLElementBuilder<SVGElementAttributes>("polyline", ::SVGElementAttributes)


object radialGradient : HTMLElementBuilder<SVGElementAttributes>("radialGradient", ::SVGElementAttributes)


object rect : HTMLElementBuilder<SVGElementAttributes>("rect", ::SVGElementAttributes)


object stop : HTMLElementBuilder<SVGElementAttributes>("stop", ::SVGElementAttributes)


object symbol : HTMLElementBuilder<SVGElementAttributes>("symbol", ::SVGElementAttributes)


object text : HTMLElementBuilder<SVGElementAttributes>("text", ::SVGElementAttributes)


object tspan : HTMLElementBuilder<SVGElementAttributes>("tspan", ::SVGElementAttributes)


object use : HTMLElementBuilder<SVGElementAttributes>("use", ::SVGElementAttributes)

