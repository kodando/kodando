@file:Suppress("UnsafeCastFromDynamic")

package kodando.react.dom

open class HTMLSelectElementAttributes : HTMLInputElementAttributes() {
    var multiple: Boolean? by jsonProperty
    var size: Int? by jsonProperty
}
