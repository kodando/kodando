package kodando.react


external interface ReactElement


fun text(something: String?): ReactElement? =
    something.unsafeCast<ReactElement?>()


fun all(vararg elements: ReactElement?): ReactElement? =
    elements.unsafeCast<ReactElement?>()

