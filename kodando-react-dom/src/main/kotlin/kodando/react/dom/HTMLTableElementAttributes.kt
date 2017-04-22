@file:Suppress("UnsafeCastFromDynamic")

package kodando.react.dom

open class HTMLTableElementAttributes : HTMLInputElementAttributes() {
    var align: String? by jsonProperty
    var border: String? by jsonProperty
    var frame: String? by jsonProperty
    var summary: String? by jsonProperty
    var cellPadding: Number? by jsonProperty
    var cellPaddingWithUnit: String? by jsonProperty("cellPadding")
    var cellSpacing: Number? by jsonProperty
    var cellSpacingWithUnit: String? by jsonProperty("cellSpacing")
}

