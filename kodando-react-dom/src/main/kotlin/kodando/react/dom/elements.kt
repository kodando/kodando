@file:Suppress("unused")

package kodando.react.dom

/**
 * Created by danfma on 03/06/2016.
 */


object a : HTMLElementBuilder<HTMLElementAnchorElementProps>("a")


object abbr : HTMLElementBuilder<HTMLElementAttributes>("abbr")


object address : HTMLElementBuilder<HTMLElementAttributes>("address")


object area : HTMLElementBuilder<HTMLAreaElementAttributes>("area")


object article : HTMLElementBuilder<HTMLElementAttributes>("article")


object aside : HTMLElementBuilder<HTMLElementAttributes>("aside")


object audio : HTMLElementBuilder<HTMLAudioElementAttributes>("audio")


object b : HTMLElementBuilder<HTMLElementAttributes>("b")


object base : HTMLElementBuilder<HTMLBaseElementAttributes>("base")


object bdi : HTMLElementBuilder<HTMLElementAttributes>("bdi")


object bdo : HTMLElementBuilder<HTMLElementAttributes>("bdo")


object big : HTMLElementBuilder<HTMLElementAttributes>("big")


object blockquote : HTMLElementBuilder<HTMLElementAttributes>("blockquote")


object body : HTMLElementBuilder<HTMLBodyElementAttributes>("body")


object br : HTMLElementBuilder<HTMLBRElementAttributes>("br") {
	operator fun invoke() =
		this.invoke { }
}


object button : HTMLElementBuilder<HTMLButtonElementAttributes>("button")


object canvas : HTMLElementBuilder<HTMLCanvasElementAttributes>("canvas")


object caption : HTMLElementBuilder<HTMLElementAttributes>("caption")


object cite : HTMLElementBuilder<HTMLElementAttributes>("cite")


object code : HTMLElementBuilder<HTMLElementAttributes>("code")


object col : HTMLElementBuilder<HTMLElementAttributes>("col")


object colgroup : HTMLElementBuilder<HTMLTableColElementAttributes>("colgroup")


object data : HTMLElementBuilder<HTMLElementAttributes>("data")


object datalist : HTMLElementBuilder<HTMLDataListElementAttributes>("datalist")


object dd : HTMLElementBuilder<HTMLElementAttributes>("dd")


object del : HTMLElementBuilder<HTMLElementAttributes>("del")


object details : HTMLElementBuilder<HTMLElementAttributes>("details")


object dfn : HTMLElementBuilder<HTMLElementAttributes>("dfn")


object dialog : HTMLElementBuilder<HTMLElementAttributes>("dialog")


object div : HTMLElementBuilder<HTMLElementAttributes>("div")


object dl : HTMLElementBuilder<HTMLElementAttributes>("dl")


object dt : HTMLElementBuilder<HTMLElementAttributes>("dt")


object em : HTMLElementBuilder<HTMLElementAttributes>("em")


object embed : HTMLElementBuilder<HTMLEmbedElementAttributes>("embed")


object fieldset : HTMLElementBuilder<HTMLFieldSetElementAttributes>("fieldset")


object figcaption : HTMLElementBuilder<HTMLElementAttributes>("figcaption")


object figure : HTMLElementBuilder<HTMLElementAttributes>("figure")


object footer : HTMLElementBuilder<HTMLElementAttributes>("footer")


object form : HTMLElementBuilder<HTMLFormElementAttributes>("form")


object h1 : HTMLElementBuilder<HTMLElementAttributes>("h1")


object h2 : HTMLElementBuilder<HTMLElementAttributes>("h2")


object h3 : HTMLElementBuilder<HTMLElementAttributes>("h3")


object h4 : HTMLElementBuilder<HTMLElementAttributes>("h4")


object h5 : HTMLElementBuilder<HTMLElementAttributes>("h5")


object h6 : HTMLElementBuilder<HTMLElementAttributes>("h6")


object head : HTMLElementBuilder<HTMLElementAttributes>("head")


object header : HTMLElementBuilder<HTMLElementAttributes>("header")


object hgroup : HTMLElementBuilder<HTMLElementAttributes>("hgroup")


object hr : HTMLElementBuilder<HTMLElementAttributes>("hr")


object html : HTMLElementBuilder<HTMLElementAttributes>("html")


object i : HTMLElementBuilder<HTMLElementAttributes>("i")


object iframe : HTMLElementBuilder<HTMLIFrameElementAttributes>("iframe")


object img : HTMLElementBuilder<HTMLImageElementAttributes>("img")


object input : HTMLElementBuilder<HTMLInputElementAttributes>("input")


object ins : HTMLElementBuilder<HTMLElementAttributes>("ins")


object kbd : HTMLElementBuilder<HTMLElementAttributes>("kbd")


object keygen : HTMLElementBuilder<HTMLElementAttributes>("keygen")


object label : HTMLElementBuilder<HTMLElementAttributes>("label")


object legend : HTMLElementBuilder<HTMLElementAttributes>("legend")


object li : HTMLElementBuilder<HTMLElementAttributes>("li")


object link : HTMLElementBuilder<HTMLLinkElementAttributes>("link")


object main : HTMLElementBuilder<HTMLElementAttributes>("main")


object map : HTMLElementBuilder<HTMLElementAttributes>("map")


object mark : HTMLElementBuilder<HTMLElementAttributes>("mark")


object menu : HTMLElementBuilder<HTMLElementAttributes>("menu")


object menuitem : HTMLElementBuilder<HTMLElementAttributes>("menuitem")


object meta : HTMLElementBuilder<HTMLMetaElementAttributes>("meta")


object meter : HTMLElementBuilder<HTMLElementAttributes>("meter")


object nav : HTMLElementBuilder<HTMLElementAttributes>("nav")


object noscript : HTMLElementBuilder<HTMLElementAttributes>("noscript")


object objectTag : HTMLElementBuilder<HTMLElementAttributes>("object")


object ol : HTMLElementBuilder<HTMLElementAttributes>("ol")


object optgroup : HTMLElementBuilder<HTMLElementAttributes>("optgroup")


object option : HTMLElementBuilder<HTMLElementAttributes>("option")


object output : HTMLElementBuilder<HTMLElementAttributes>("output")


object p : HTMLElementBuilder<HTMLElementAttributes>("p")


object param : HTMLElementBuilder<HTMLElementAttributes>("param")


object picture : HTMLElementBuilder<HTMLElementAttributes>("picture")


object pre : HTMLElementBuilder<HTMLElementAttributes>("pre")


object progress : HTMLElementBuilder<HTMLElementAttributes>("progress")


object q : HTMLElementBuilder<HTMLElementAttributes>("q")


object rp : HTMLElementBuilder<HTMLElementAttributes>("rp")


object rt : HTMLElementBuilder<HTMLElementAttributes>("rt")


object ruby : HTMLElementBuilder<HTMLElementAttributes>("ruby")


object s : HTMLElementBuilder<HTMLElementAttributes>("s")


object samp : HTMLElementBuilder<HTMLElementAttributes>("samp")


object script : HTMLElementBuilder<HTMLElementAttributes>("script")


object section : HTMLElementBuilder<HTMLElementAttributes>("section")


object select : HTMLElementBuilder<HTMLSelectElementAttributes>("select")


object small : HTMLElementBuilder<HTMLElementAttributes>("small")


object source : HTMLElementBuilder<HTMLElementAttributes>("source")


object span : HTMLElementBuilder<HTMLElementAttributes>("span")


object strong : HTMLElementBuilder<HTMLElementAttributes>("strong")


object style : HTMLElementBuilder<HTMLElementAttributes>("style")


object sub : HTMLElementBuilder<HTMLElementAttributes>("sub")


object summary : HTMLElementBuilder<HTMLElementAttributes>("summary")


object sup : HTMLElementBuilder<HTMLElementAttributes>("sup")


object table : HTMLElementBuilder<HTMLTableElementAttributes>("table")


object tbody : HTMLElementBuilder<HTMLElementAttributes>("tbody")


object td : HTMLElementBuilder<HTMLTableColElementAttributes>("td")


object textarea : HTMLElementBuilder<HTMLInputElementAttributes>("textarea")


object tfoot : HTMLElementBuilder<HTMLElementAttributes>("tfoot")


object th : HTMLElementBuilder<HTMLTableColElementAttributes>("th")


object thead : HTMLElementBuilder<HTMLElementAttributes>("thead")


object time : HTMLElementBuilder<HTMLElementAttributes>("time")


object title : HTMLElementBuilder<HTMLElementAttributes>("title")


object tr : HTMLElementBuilder<HTMLTableRowElementAttributes>("tr")


object track : HTMLElementBuilder<HTMLElementAttributes>("track")


object u : HTMLElementBuilder<HTMLElementAttributes>("u")


object ul : HTMLElementBuilder<HTMLElementAttributes>("ul")


object variable : HTMLElementBuilder<HTMLElementAttributes>("var")


object video : HTMLElementBuilder<HTMLVideoElementAttributes>("video")


object wbr : HTMLElementBuilder<HTMLElementAttributes>("wbr")


// SVG
object svg : HTMLElementBuilder<SVGElementAttributes>("svg")


object circle : HTMLElementBuilder<SVGElementAttributes>("circle")


object defs : HTMLElementBuilder<SVGElementAttributes>("defs")


object ellipse : HTMLElementBuilder<SVGElementAttributes>("ellipse")


object g : HTMLElementBuilder<SVGElementAttributes>("g")


object image : HTMLElementBuilder<SVGElementAttributes>("image")


object line : HTMLElementBuilder<SVGElementAttributes>("line")


object linearGradient : HTMLElementBuilder<SVGElementAttributes>("linearGradient")


object mask : HTMLElementBuilder<SVGElementAttributes>("mask")


object path : HTMLElementBuilder<SVGElementAttributes>("path")


object pattern : HTMLElementBuilder<SVGElementAttributes>("pattern")


object polygon : HTMLElementBuilder<SVGElementAttributes>("polygon")


object polyline : HTMLElementBuilder<SVGElementAttributes>("polyline")


object radialGradient : HTMLElementBuilder<SVGElementAttributes>("radialGradient")


object rect : HTMLElementBuilder<SVGElementAttributes>("rect")


object stop : HTMLElementBuilder<SVGElementAttributes>("stop")


object symbol : HTMLElementBuilder<SVGElementAttributes>("symbol")


object text : HTMLElementBuilder<SVGElementAttributes>("text")


object tspan : HTMLElementBuilder<SVGElementAttributes>("tspan")


object use : HTMLElementBuilder<SVGElementAttributes>("use")

