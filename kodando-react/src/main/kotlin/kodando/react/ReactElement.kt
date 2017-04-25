package kodando.react


external interface ReactElement


inline fun raw(something: Any?): ReactElement? = something.unsafeCast<ReactElement?>()

inline fun all(vararg elements: ReactElement?): ReactElement? = elements.unsafeCast<ReactElement?>()

