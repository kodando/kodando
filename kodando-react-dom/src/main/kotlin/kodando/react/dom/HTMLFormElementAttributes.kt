package kodando.react.dom

interface HTMLFormElementAttributes : HTMLElementAttributes {
    var action: String?
    var method: String?
    var autocomplete: String?
    var encoding: String?
    var enctype: String?
    var target: String?
}