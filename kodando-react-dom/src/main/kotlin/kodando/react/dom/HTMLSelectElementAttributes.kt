@file:Suppress("UnsafeCastFromDynamic")

package kodando.react.dom

interface HTMLSelectElementAttributes : HTMLInputElementAttributes


inline var HTMLSelectElementAttributes.multiple: Boolean?
	get() = this.asDynamic().multiple
	set(value) {
		this.asDynamic().multiple = value
	}

inline var HTMLSelectElementAttributes.size: Int?
	get() = this.asDynamic().size
	set(value) {
		this.asDynamic().size = value
	}

