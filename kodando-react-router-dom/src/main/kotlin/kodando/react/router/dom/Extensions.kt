@file:Suppress("unused")

package kodando.react.router.dom

/**
 * Created by danfma on 04/04/17.
 */

inline var RouteTo.toUrl: String
  get() = this.to as String
  set(value) {
    this.to = value
  }

inline var RouteTo.toLocation: Location
  get() = this.to as Location
  set(value) {
    this.to = value
  }

inline var PromptProps.messageText: String
  get() = this.message as String
  set(value) {
    this.message = value
  }

inline var PromptProps.messageFunc: (Location) -> String
  get() = this.message.unsafeCast<(Location) -> String>()
  set(value) {
    this.message = value.unsafeCast<Any>()
  }
